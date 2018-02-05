package com.prgsft.task.service.summaryreport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.prgsft.task.dto.summaryreport.SummaryReportDTO;
import com.prgsft.task.model.UploadSummaryReport;
import com.prgsft.task.repository.summaryreport.UploadSummaryReportRepository;

@Service("summaryReportService")
public class SummaryReportServiceImpl implements SummaryReportService{
	
	
	@Autowired
	UploadSummaryReportRepository uploadSummaryReportRepository;

	@Override
	@Transactional
	@Cacheable(value="searchfilename", key="#sourceFileName")
	public SummaryReportDTO findBySourceFileName(String sourceFileName) {
		
		UploadSummaryReport uploadSummaryReport =	uploadSummaryReportRepository.findBySourceFileName(sourceFileName);
		
		if( uploadSummaryReport == null ){
			return null;
		}
		
		SummaryReportDTO	summaryReportDTO 	=	new SummaryReportDTO();
		summaryReportDTO.setSourceFileName(sourceFileName);
		summaryReportDTO.setValidDealsImportedCount(uploadSummaryReport.getValidDealsImportedCount());
		summaryReportDTO.setInvalidDealsImportedCount(uploadSummaryReport.getInvalidDealsImportedCount());
		summaryReportDTO.setProcessDuration(String.valueOf(uploadSummaryReport.getProcessDuration()));
		summaryReportDTO.setImportDate(uploadSummaryReport.getImportDate().toString());
		
		return summaryReportDTO;
	}

}
