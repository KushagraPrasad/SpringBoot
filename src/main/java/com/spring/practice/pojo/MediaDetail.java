package com.spring.practice.pojo;

public class MediaDetail {
private String fileName;
private int fileSize;
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public int getFileSize() {
	return fileSize;
}
@Override
public String toString() {
	return "MediaDetail [fileName=" + fileName + ", fileSize=" + fileSize + "]";
}
public void setFileSize(int fileSize) {
	this.fileSize = fileSize;
}
}
