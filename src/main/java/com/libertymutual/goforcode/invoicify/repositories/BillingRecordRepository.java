package com.libertymutual.goforcode.invoicify.repositories;

import com.libertymutual.goforcode.invoicify.models.BillingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillingRecordRepository extends JpaRepository<BillingRecord, Long>{

	
}
