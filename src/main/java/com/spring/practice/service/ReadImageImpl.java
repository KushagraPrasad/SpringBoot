package com.spring.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.repository.MediaRepository;

@Service
public class ReadImageImpl implements ReadImage {

	@Autowired
	MediaRepository mediaRepository;

	@Override
	public List<Media> readAll() {
		return mediaRepository.findAll();

	}

	@Override
	public Optional<Media> read(long id) {
		return mediaRepository.findById(id);
	}
}