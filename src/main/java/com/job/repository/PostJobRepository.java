package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsJobMaster;

@Repository
public interface PostJobRepository extends CrudRepository<HsJobMaster, Long>{

}


