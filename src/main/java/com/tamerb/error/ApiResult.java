package com.tamerb.error;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.Map;

// lombok
@Data
// JSON: Eğer bu fieldlarda null varsa backentte girmesin
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

    private String path;
    private Map<String, String> validationErrors;
    private String message;
    private Date date;
    private int status;

    public ApiResult() {
    }

    public ApiResult(String path, String message, int status) {
        this.path = path;
        this.message = message;
        this.status = status;
    }
}
