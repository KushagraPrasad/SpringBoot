package com.spring.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;

@Service
public interface MediaService {

	public void delete(long id) throws Exception;

	public Media upload(MediaDetail image) throws Exception;

	public Media update(MediaDetail image, Long id) throws Exception;

	public Optional<Media> read(long id) throws Exception;

	public List<Media> readAll() throws Exception;

}
