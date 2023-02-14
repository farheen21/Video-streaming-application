package com.codeamiba.Videostreamingapplication.service;

import com.codeamiba.Videostreamingapplication.model.Video;
import com.codeamiba.Videostreamingapplication.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;

    public void uploadVideo(MultipartFile multipartFile) {
        //upload file to AWS S3
        // Save video data to Database
        String videoUrl = s3Service.uploadFile(multipartFile);
        var video = new Video();
        video.setVideourl(videoUrl);
        videoRepository.save(video);
    }
}
