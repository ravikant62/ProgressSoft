package com.prgsft.task.repository.fileimport;

import java.util.List;

import com.prgsft.task.model.InvalidDeal;

public interface InvalidDealRepositoryBatchInsert {

	void batchInsert(List<InvalidDeal> validDeal);
}
