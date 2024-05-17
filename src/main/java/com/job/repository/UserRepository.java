package com.job.repository;

import com.job.entity.HsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<HsUser, Long> {
	public HsUser findByUserId(Long userId);

}
