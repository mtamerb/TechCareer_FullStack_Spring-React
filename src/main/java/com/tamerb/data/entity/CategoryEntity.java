package com.tamerb.data.entity;

import com.tamerb.auditing.AuditingAwareBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// LOMBOK
@Data
@Log4j2

// ENTITY
@Entity
@Table(name = "categories")
// Categories(1)  Blog(N)
public class CategoryEntity extends AuditingAwareBaseEntity implements Serializable {

    // Serileştirme
    public static final Long serialVersionUID = 1L;

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id", unique = true, nullable = false, insertable = true, updatable = false)
    private Long categoryId;

    // HEADER
    @Column(name = "category_name", length = 500, columnDefinition = "varchar(500) default 'java'")
    private String categoryName;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;

    // relation
    @OneToMany(mappedBy = "relationCategoryEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<BlogEntity> relationBlogEntityList;

    public CategoryEntity() {
    }

    public CategoryEntity(String categoryName) {
        this.categoryName = categoryName;
    }


}