package com.spring.practice.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.practice.entity.Media;
import com.spring.practice.pojo.MediaDetail;
import com.spring.practice.service.MediaService;

@RestController
@RequestMapping("/api")
public class MediaController {

	@Autowired
	MediaService mediaService;

	private static final Logger logger = Logger.getLogger(MediaController.class.getName());

	@PostMapping(value = "/image")
	public Media uploadMedia(@RequestBody MediaDetail image) throws Exception {
		logger.info("Upload image called with image : " + image);
		return mediaService.upload(image);
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.DELETE)
	public void deleteMedia(@PathVariable long id) throws Exception {
		logger.info("Delete image called with image:" + id);
		mediaService.delete(id);
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
	public Optional<Media> readMedia(@PathVariable long id) throws Exception {
		logger.info("Read image called with image:" + id);
		return mediaService.read(id);
	}

	@RequestMapping(value = "/image", method = RequestMethod.GET)
	public List<Media> readAll() throws Exception {
		logger.info("Read all image");
		return mediaService.readAll();
	}

	@PutMapping("/image/{id}")
	public Media replaceMedia(@RequestBody MediaDetail image, @PathVariable Long id) throws Exception {
		logger.info("Media Replaced.");
		return mediaService.update(image, id);
	}
}