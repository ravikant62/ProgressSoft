package com.prgsft.task.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

import com.prgsft.task.validations.FileFormat;

public class FileFormatValidator implements ConstraintValidator<FileFormat, MultipartFile>{

	@Override
	public void initialize(FileFormat fileFormat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext validatorContext) {
		
		return multipartFile.getContentType().equals("text/csv");
	}
	
	

}
