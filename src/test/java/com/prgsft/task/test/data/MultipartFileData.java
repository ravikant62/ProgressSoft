package com.prgsft.task.test.data;

import org.springframework.web.multipart.MultipartFile;

import com.prgsft.task.validations.FileFormat;

public class MultipartFileData {
	
	@FileFormat
	MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}

