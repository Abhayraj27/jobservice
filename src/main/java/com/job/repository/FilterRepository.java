package com.job.repository;

import com.job.entity.JobBoardView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepository extends JpaRepository<JobBoardView, Long>, JpaSpecificationExecutor<JobBoardView>{
	

}
