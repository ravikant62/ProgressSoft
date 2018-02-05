package com.prgsft.task.repository.fileimport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prgsft.task.model.InvalidDeal;

@Repository
public interface InvalidDealRepository extends JpaRepository<InvalidDeal, String>{

}
