package com.job.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsJobBoardMaster;

@Repository
public interface JobBoardMasterRepository extends CrudRepository<HsJobBoardMaster, Integer> {
   
	List<HsJobBoardMaster> findByJobBoardId(Integer jobBoardId);

}
