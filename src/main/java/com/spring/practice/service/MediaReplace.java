package com.spring.practice.service;

import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;

@Service
public interface MediaReplace {
	public Media replace(MediaDetail image, Long id);
}
