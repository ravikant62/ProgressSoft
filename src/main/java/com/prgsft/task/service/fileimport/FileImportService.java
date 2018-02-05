package com.prgsft.task.service.fileimport;

import org.springframework.web.multipart.MultipartFile;

import com.prgsft.task.model.UploadSummaryReport;

public interface FileImportService {
	
	void fileUpload( MultipartFile multipartFile, UploadSummaryReport summaryReportModel);

	boolean isFileAlreadyImported(String originalFilename);

}
