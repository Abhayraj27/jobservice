package com.job.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.JobBoardView;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobBoardView, Long> {

	List<JobBoardView> findByStatusAndId( Integer status, Long id);
	Page<JobBoardView> findByStatusAndCustId(Integer status, Long custId, Pageable pageable);

}
