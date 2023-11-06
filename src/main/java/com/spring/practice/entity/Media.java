package com.spring.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Media {

	public Media(String fileName, int fileSize) {
		// TODO Auto-generated constructor stub
		this.filename=fileName;
		this.filesize=fileSize;
	}
	private String filename;
	private int filesize;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	
	public Media() {
		
	}
	public Media(String filename, int filesize, long id) {
		super();
		this.filename = filename;
		this.filesize = filesize;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Media [filename=" + filename + ", filesize=" + filesize + ", id=" + id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getFilesize() {
		return filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

}
