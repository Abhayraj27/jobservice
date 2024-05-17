package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsJobFilterKeywordMaster;

@Repository
public interface JobFilterKeywordRepository extends CrudRepository<HsJobFilterKeywordMaster, Integer>{

}
