package com.prgsft.task.repository.summaryreport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prgsft.task.model.UploadSummaryReport;

@Repository
public interface UploadSummaryReportRepository extends JpaRepository<UploadSummaryReport, String> {
	
	UploadSummaryReport findBySourceFileName( String sourceFileName );

}
