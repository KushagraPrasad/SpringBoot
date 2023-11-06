package com.spring.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;

@Service
public interface ReadImage {
	public Optional<Media> read(long id);
	public List<Media> readAll();
}
