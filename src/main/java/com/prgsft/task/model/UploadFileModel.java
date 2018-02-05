package com.prgsft.task.model;

import org.springframework.web.multipart.MultipartFile;

import com.prgsft.task.validations.FileFormat;
import com.prgsft.task.validations.NotEmptyFile;

public class UploadFileModel {
	
	@FileFormat
	@NotEmptyFile
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
