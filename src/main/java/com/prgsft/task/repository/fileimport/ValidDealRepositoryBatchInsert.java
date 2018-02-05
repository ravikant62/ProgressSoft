package com.prgsft.task.repository.fileimport;

import java.util.List;

import com.prgsft.task.model.ValidDeal;

public interface ValidDealRepositoryBatchInsert {

	void batchInsert(List<ValidDeal> validDeal);
}
