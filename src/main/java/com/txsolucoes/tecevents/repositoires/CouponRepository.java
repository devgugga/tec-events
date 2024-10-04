package com.txsolucoes.tecevents.repositoires;

import com.txsolucoes.tecevents.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
