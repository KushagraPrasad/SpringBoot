package com.spring.practice.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;
import com.spring.practice.repository.MediaRepository;

@Service
public class ImageUploadServiceImpl implements ImageUploadService {

//	@Autowired [constructor injection]
//	public void ImageUploadService(ReadImage readimage) {
//		this.readimage = readimage;
//	}

	// @Autowired [Field injection]
	ReadImage readimage;

	@Autowired
	MediaRepository mediaRepository;
	
	private static final Logger logger = Logger.getLogger(ImageUploadServiceImpl.class.getName());

	public ReadImage getReadimage() {
		return readimage;
	}

	// [setter injection]
	@Autowired
	public void setReadimage(ReadImage readimage) {
		this.readimage = readimage;
	}

	public Media upload(MediaDetail media) {
		logger.info("inside upload method");
		Media mediaa = new Media(media.getFileName(),media.getFileSize());
		Media m1 = mediaRepository.save(mediaa);
		return m1;
	}
}
