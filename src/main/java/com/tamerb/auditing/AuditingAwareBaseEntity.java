package com.tamerb.auditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
@JsonIgnoreProperties(value = {"created_date,updated_date"},allowGetters = true)
@EntityListeners(AuditingEntityListener.class)
abstract public class AuditingAwareBaseEntity implements Serializable {

    // serileştirme
    public static final Long serialVersionUID = 1L;

    // auditing

    // kim ekledi
    @CreatedBy
    @Column(name = "created_user", length = 50, columnDefinition = "varchar(50) default 'system'")
    protected String createdUser;

    // kim guncelledi
    @LastModifiedBy
    @Column(name = "updated_user", length = 50, columnDefinition = "varchar(50) default 'system'")
    protected String updatedUser;

    // ne zaman ekledi
    @CreatedDate
    @Column(name = "created_date", length = 50, columnDefinition = "varchar(50) default 'system'")
    protected String createdDate;

    // ne zaman guncelledi
    @LastModifiedDate
    @Column(name = "updated_date", length = 50, columnDefinition = "varchar(50) default 'system'")
    protected String updatedDate;


}
