package com.prgsft.task.service.summaryreport;

import com.prgsft.task.dto.summaryreport.SummaryReportDTO;

public interface SummaryReportService {
	
	SummaryReportDTO findBySourceFileName( String sourceFileName );
}
