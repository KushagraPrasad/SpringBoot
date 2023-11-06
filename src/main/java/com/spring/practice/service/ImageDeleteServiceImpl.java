package com.spring.practice.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.repository.MediaRepository;


@Service
public class ImageDeleteServiceImpl implements ImageDeleteService{
	
	@Autowired
	MediaRepository mediaRepository;
	
	private static final Logger logger = Logger.getLogger(ImageUploadServiceImpl.class.getName());
	public void delete(long id) {
		logger.info("inside delete method");
		mediaRepository.deleteById(id);
	}
}
