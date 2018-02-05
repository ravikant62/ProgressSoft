package com.prgsft.task.service.alltransaction;

import java.util.List;

import com.prgsft.task.model.AccumulativeCurrencyDealCount;
import com.prgsft.task.model.InvalidDeal;
import com.prgsft.task.model.UploadSummaryReport;
import com.prgsft.task.model.ValidDeal;

public interface TransactionService {

	
	public void saveAllValidDeals( List<ValidDeal> validDeals );
	
	public void saveAllInvalidDeals( List<InvalidDeal> invalidDeals );
	
	public void saveAllAccumulativeCurrencyCodeCount( List<AccumulativeCurrencyDealCount> accumulativeCurrencyCodeCount);
	
	public void saveAllUploadSummaryReport( UploadSummaryReport summaryReportModel );
}
