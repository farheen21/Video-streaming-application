package com.codeamiba.Videostreamingapplication.repository;

import com.codeamiba.Videostreamingapplication.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface VideoRepository extends MongoRepository<Video, String> {

}
