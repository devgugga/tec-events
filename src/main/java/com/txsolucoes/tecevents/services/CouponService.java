package com.txsolucoes.tecevents.services;

import com.txsolucoes.tecevents.domain.coupon.Coupon;
import com.txsolucoes.tecevents.domain.coupon.CouponRequestDTO;
import com.txsolucoes.tecevents.domain.event.Event;
import com.txsolucoes.tecevents.repositoires.CouponRepository;
import com.txsolucoes.tecevents.repositoires.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CouponService {

    @Autowired
    private CouponRepository repository;

    @Autowired
    private EventRepository eventRepository;

    public Coupon createCoupon(UUID eventId, CouponRequestDTO data) {

        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Could not find event"));

        Coupon coupon = new Coupon();
        coupon.setCode(data.code());
        coupon.setDiscount(data.discount());
        coupon.setValid(new Date(data.valid()));
        coupon.setEvent(event);

        return repository.save(coupon);
    }
}
