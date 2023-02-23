package com.codeamiba.Videostreamingapplication;

import com.codeamiba.Videostreamingapplication.repository.VideoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = VideoRepository.class)
public class VideoStreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoStreamingApplication.class, args);
	}

}
