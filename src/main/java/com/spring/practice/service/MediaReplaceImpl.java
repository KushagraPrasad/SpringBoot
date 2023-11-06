package com.spring.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;
import com.spring.practice.repository.MediaRepository;

@Service
public class MediaReplaceImpl implements MediaReplace {

	@Autowired
	MediaRepository mediaRepository;

	@Override
	public Media replace(MediaDetail media, Long id) {
		Optional<Media> m1 = mediaRepository.findById(id);
		Media m2 = m1.get();
		m2.setFilename(media.getFileName());
		m2.setFilesize(media.getFileSize());
		return mediaRepository.save(m2);
	}
}
