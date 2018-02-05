package com.prgsft.task.test.data;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class MultipartFileEmptyData implements MultipartFile{
	
	
	String originalFileName;
	
	long size;
	
	
	public MultipartFileEmptyData( String originalFileName, long size) {
		this.originalFileName = originalFileName;
		this.size	=	size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOriginalFilename() {
		// TODO Auto-generated method stub
		return originalFileName;
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public byte[] getBytes() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transferTo(File dest) throws IOException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	
}
