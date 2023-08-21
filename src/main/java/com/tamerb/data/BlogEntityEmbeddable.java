package com.tamerb.data;


// yukleri paylasalım


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class BlogEntityEmbeddable {

    // HEADER
    @Column(name = "header", length = 500, columnDefinition = "varchar(500) default 'başlık yazılmadı...'")
    private String header;

    // CONTENT
    @Lob
    private String content;

    // TITLE
    private String title;

    // IMAGE
    private String image;

}
