package com.job.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.job.entity.HsJobCouponCode;

public interface CouponCodeRepository extends CrudRepository<HsJobCouponCode, Integer> {
   @Query(value = "SELECT u FROM HsJobCouponCode u where u.code = :couponCode")
	List<HsJobCouponCode> findDiscountByCouponCode(@Param("couponCode") String couponCode);

}
