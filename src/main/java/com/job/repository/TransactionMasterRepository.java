package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsTransactionMaster;

@Repository
public interface TransactionMasterRepository extends CrudRepository<HsTransactionMaster, Long>
{

	
}
