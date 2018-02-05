package com.prgsft.task.service.alltransaction;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.prgsft.task.model.AccumulativeCurrencyDealCount;
import com.prgsft.task.model.InvalidDeal;
import com.prgsft.task.model.UploadSummaryReport;
import com.prgsft.task.model.ValidDeal;
import com.prgsft.task.repository.fileimport.AccumulativeCurrencyDealCountRepository;
import com.prgsft.task.repository.fileimport.InvalidDealRepositoryBatchInsert;
import com.prgsft.task.repository.fileimport.ValidDealRepositoryBatchInsert;
import com.prgsft.task.repository.summaryreport.UploadSummaryReportRepository;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceTest {


	@Mock
	ValidDealRepositoryBatchInsert validDealRepositoryBatchInsert;

	@Mock
	InvalidDealRepositoryBatchInsert invalidDealRepositoryBatchInsert;

	@Mock
	AccumulativeCurrencyDealCountRepository accumulativeCurrencyDealCountRepository;

	@Mock
	UploadSummaryReportRepository uploadSummaryReportRepository;

	@InjectMocks
	private TransactionService transactionService = new TransactionServiceImpl();


	@Test
	public void testSaveAllValidDeals () {

		List<ValidDeal> validDeals = new ArrayList<ValidDeal>();

		transactionService.saveAllValidDeals(validDeals);

		verify(validDealRepositoryBatchInsert, atLeastOnce()).batchInsert(eq(validDeals));

	}
	
	@Test
	public void testSaveAllInvalidDeals () {

		List<InvalidDeal> invalidDeals = new ArrayList<InvalidDeal>();

		transactionService.saveAllInvalidDeals(invalidDeals);

		verify(invalidDealRepositoryBatchInsert, atLeastOnce()).batchInsert(eq(invalidDeals));

	}
	
	
	@Test
	public void testSaveAllAccumulativeCurrencyCodeCount () {

		List<AccumulativeCurrencyDealCount> accumulativeCurrencyCodeDealCountList = new ArrayList<AccumulativeCurrencyDealCount>();

		transactionService.saveAllAccumulativeCurrencyCodeCount(accumulativeCurrencyCodeDealCountList);

		verify(accumulativeCurrencyDealCountRepository, atLeastOnce()).save(eq(accumulativeCurrencyCodeDealCountList));

	}
	
	@Test
	public void testSaveAllUploadSummaryReport () {

		UploadSummaryReport uploadSummaryReport = new UploadSummaryReport();

		transactionService.saveAllUploadSummaryReport(uploadSummaryReport);

		verify(uploadSummaryReportRepository, atLeastOnce()).save(eq(uploadSummaryReport));

	}


}
