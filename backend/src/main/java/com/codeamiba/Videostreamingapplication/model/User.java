package com.codeamiba.Videostreamingapplication.model;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;

//@Document(value = "User")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class User {
//
//    @Id
//    private String id;
//    private String firstName;
//    private String lastName;
//    private String fullName;
//    private String picture;
//    private String emailAddress;
//    private String sub;
//    private Set<String> subscribedToUsers = new HashSet<>();
//    private Set<String> subscribers = new HashSet<>();
//    private Set<String> videoHistory = new LinkedHashSet<>();
//    private Set<String> likedVideos = new HashSet<>();
//    private Set<String> disLikedVideos = new HashSet<>();
//}


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(value = "User")
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String emailAddress;
    private Set<String> subscribedToUsers;
    private Set<String> subscribers;
    private List<String> videoHistory;
    private Set<String> likedVideos;
    private Set<String> disLikedVideos;
}
