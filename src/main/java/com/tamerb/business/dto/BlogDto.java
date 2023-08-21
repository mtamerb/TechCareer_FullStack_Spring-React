package com.tamerb.business.dto;

import com.tamerb.auditing.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class BlogDto extends AuditingAwareBaseDto implements Serializable {

    // serileştirme
    public static final Long serialVersionUID = 1L;

    // HEADER
    @NotEmpty(message = "{blog.header.validation.constraints.NotNull.message}")
    @Size(min = 10, message = "{blog.header.least.validation.constraints.NotNull.message}")
    private String header;

    // CONTENT
    @NotEmpty(message = "{blog.content.validation.constraints.NotNull.message}")
    @Size(min = 10, message = "{blog.content.least.validation.constraints.NotNull.message}")
    private String content;
}


