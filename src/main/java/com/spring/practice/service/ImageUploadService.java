package com.spring.practice.service;

import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;

@Service
public interface ImageUploadService {
	public Media upload(MediaDetail image);
}
