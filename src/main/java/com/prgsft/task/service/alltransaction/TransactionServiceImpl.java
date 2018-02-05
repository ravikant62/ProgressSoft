package com.prgsft.task.service.alltransaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prgsft.task.model.AccumulativeCurrencyDealCount;
import com.prgsft.task.model.InvalidDeal;
import com.prgsft.task.model.UploadSummaryReport;
import com.prgsft.task.model.ValidDeal;
import com.prgsft.task.repository.fileimport.AccumulativeCurrencyDealCountRepository;
import com.prgsft.task.repository.fileimport.InvalidDealRepositoryBatchInsert;
import com.prgsft.task.repository.fileimport.ValidDealRepositoryBatchInsert;
import com.prgsft.task.repository.summaryreport.UploadSummaryReportRepository;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	ValidDealRepositoryBatchInsert validDealRepositoryBatchInsert;

	@Autowired
	InvalidDealRepositoryBatchInsert invalidDealRepositoryBatchInsert;

	@Autowired
	AccumulativeCurrencyDealCountRepository accumulativeCurrencyDealCountRepository;
	
	@Autowired
	UploadSummaryReportRepository uploadSummaryReportRepository;

	@Override
	public void saveAllValidDeals(List<ValidDeal> validDeals) {
		validDealRepositoryBatchInsert.batchInsert(validDeals);
	}

	@Override
	public void saveAllInvalidDeals(List<InvalidDeal> invalidDeals) {
		invalidDealRepositoryBatchInsert.batchInsert(invalidDeals);
		
	}

	@Override
	public void saveAllAccumulativeCurrencyCodeCount(
			List<AccumulativeCurrencyDealCount> accumulativeCurrencyDealList) {
		accumulativeCurrencyDealCountRepository.save(accumulativeCurrencyDealList);
		
	}

	@Override
	public void saveAllUploadSummaryReport(UploadSummaryReport summaryReportModel) {
		uploadSummaryReportRepository.save(summaryReportModel);
	}

}
