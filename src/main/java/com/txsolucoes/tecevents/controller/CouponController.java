package com.txsolucoes.tecevents.controller;

import com.txsolucoes.tecevents.domain.coupon.Coupon;
import com.txsolucoes.tecevents.domain.coupon.CouponRequestDTO;
import com.txsolucoes.tecevents.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;


    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> create(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon newCoupon = this.couponService.createCoupon(eventId, data);
        return ResponseEntity.ok(newCoupon);
    }
}
