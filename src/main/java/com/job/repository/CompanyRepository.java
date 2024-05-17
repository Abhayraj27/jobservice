package com.job.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.job.entity.HsCompanyMaster;

@Repository
public interface CompanyRepository extends CrudRepository<HsCompanyMaster, Integer> {
    HsCompanyMaster findByCompanyId(Integer companyId);

}
