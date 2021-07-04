package com.heroku.spacey.services;

import com.heroku.spacey.dto.order.CheckoutDto;
import com.heroku.spacey.entity.Timeslots;

public interface CheckoutService {

    CheckoutDto getCheckout();

    CheckoutDto getAuctionCheckout(Long auctionId);

    Timeslots getAvailableTimeslots(Timeslots timeslots);
}
