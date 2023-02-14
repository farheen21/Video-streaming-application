package com.codeamiba.Videostreamingapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(value = "Video")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private String videourl;
    private String thumbnailUrl;
    private Integer likes;
    private Integer dislikes;
    private Set<String> tags;
    private VideoStatus videoStatus;
    private Integer viewCount;
    private List<Comment> commentList;
}
