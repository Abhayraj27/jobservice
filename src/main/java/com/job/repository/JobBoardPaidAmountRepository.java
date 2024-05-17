package com.job.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.job.entity.HsJobBoardMaster;

@Repository
public interface JobBoardPaidAmountRepository extends JpaRepository<HsJobBoardMaster, Integer> {
	
	@Query(value = "SELECT u FROM HsJobBoardMaster u where u.jobBoardId in (:jobBoardId)")
	List<HsJobBoardMaster> findPaymentAmtByJobBoardId(@Param("jobBoardId")List<Integer> jobBoardId);
	
}
