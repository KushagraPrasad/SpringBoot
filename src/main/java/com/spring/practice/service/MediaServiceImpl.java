package com.spring.practice.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.entity.Media;
import com.spring.practice.exception.MediaServiceException;
import com.spring.practice.pojo.MediaDetail;
import com.spring.practice.repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService {
	
	@Autowired
	MediaRepository mediaRepository;

	private static final Logger logger = Logger.getLogger(MediaServiceImpl.class.getName());
	
	public void delete(long id) {
		logger.info("inside delete method");
		mediaRepository.deleteById(id);
	}

	public Media update(MediaDetail media, Long id) throws Exception {
		Optional<Media> m1 = mediaRepository.findById(id);
		Media m2 = m1.get();
		m2.setFilename(media.getFileName());
		m2.setFilesize(media.getFileSize());
		return mediaRepository.save(m2);
	}

	public Media upload(MediaDetail media) throws Exception {
		if (media.getFileSize() == 0) {
			throw new MediaServiceException("file size is not acceptable");
		}
		logger.info("inside upload method");
		Media mediaa = new Media(media.getFileName(), media.getFileSize());
		Media m1 = mediaRepository.save(mediaa);
		return m1;
	}

	public List<Media> readAll() throws Exception {
		return mediaRepository.findAll();
	}

	public Optional<Media> read(long id) throws Exception {
		if (id == 0) {
			throw new MediaServiceException("id is invalid");
		}
		return mediaRepository.findById(id);
	}

}
