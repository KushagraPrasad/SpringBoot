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
import com.spring.practice.service.ImageDeleteService;
import com.spring.practice.service.ImageUploadService;
import com.spring.practice.service.MediaReplace;
import com.spring.practice.service.ReadImage;

@RestController
@RequestMapping("/api")
public class MediaController {

	@Autowired
	ImageUploadService imageupload;
	@Autowired
	ImageDeleteService deleteimage;
	@Autowired
	ReadImage readimage;
	@Autowired
	MediaReplace mediareplace;
	
	private static final Logger logger = Logger.getLogger(MediaController.class.getName());

	@PostMapping(value = "/image")
	public Media uploadMedia(@RequestBody MediaDetail image) {
		logger.info("Upload image called with image : " + image);
		return imageupload.upload(image);
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.DELETE)
	public void deleteMedia(@PathVariable long id) {
		logger.info("Delete image called with image:" + id);
		deleteimage.delete(id);
	}

	@RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
	public Optional<Media> readMedia(@PathVariable long id) {
		logger.info("Read image called with image:" + id);
		return readimage.read(id);
	}

	@RequestMapping(value = "/image", method = RequestMethod.GET)
	public List<Media> readAll() {
		logger.info("Read all image");
		return readimage.readAll();
	}
	
	@PutMapping("/image/{id}")
    public Media replaceMedia(@RequestBody MediaDetail image, @PathVariable Long id) {
		logger.info("Media Replaced.");
		return mediareplace.replace(image,id);
}
}