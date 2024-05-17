package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.job.entity.HsdefaultJobFilterQaMaster;

@Repository
public interface JobFilterQuestionRepository extends CrudRepository<HsdefaultJobFilterQaMaster, Integer> {

}
