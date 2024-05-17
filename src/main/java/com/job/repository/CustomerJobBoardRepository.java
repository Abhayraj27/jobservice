package com.job.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.job.entity.HsCustJobboard;

@Repository
public interface CustomerJobBoardRepository extends CrudRepository<HsCustJobboard, Integer> {
	@Query(value = "SELECT u FROM HsCustJobboard u where u.jobboardId = :jobBoardId")
	List<HsCustJobboard> findByJobBoardId(@Param("jobBoardId") Integer jobBoardId);

}
