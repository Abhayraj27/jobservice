package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsDefaultJobFilterQaOptionMaster;

@Repository
public interface JobFilterQuestionOptionRepository extends CrudRepository<HsDefaultJobFilterQaOptionMaster, Integer> {


}
