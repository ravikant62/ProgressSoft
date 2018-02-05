package com.prgsft.task.validations;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;

import com.prgsft.task.test.data.MultipartFileData;

public class FileFormatValidatorTest {
	
	private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	
	@Test
    public void testInvalidFileFormat() {

        MultipartFileData multipartFileData = new MultipartFileData();
        multipartFileData.setFile(new MockMultipartFile("filename","filename.csv", "image/jpeg", new byte[2]));

        Set<ConstraintViolation<MultipartFileData>> constraintViolations = validator.validate(multipartFileData);

        assertThat(constraintViolations, hasSize(1));
    }
	
	
	@Test
    public void testValidFileFormat() {

        MultipartFileData multipartFileData = new MultipartFileData();
        multipartFileData.setFile(new MockMultipartFile("filename","filename.csv", "text/csv", new byte[2]));

        Set<ConstraintViolation<MultipartFileData>> constraintViolations = validator.validate(multipartFileData);

        assertThat(constraintViolations, hasSize(0));
    }

}
