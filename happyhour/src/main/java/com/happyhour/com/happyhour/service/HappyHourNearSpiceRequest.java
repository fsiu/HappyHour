package com.happyhour.com.happyhour.service;

import com.happyhour.com.happyhour.model.Users;

/**
 * Created by fsiu on 5/16/14.
 */
public class HappyHourNearSpiceRequest extends BaseHappyHourUserSpiceRequest {

    public HappyHourNearSpiceRequest(final String userId) {
        super(userId);
    }

    @Override
    public Users loadDataFromNetwork() {
        return getService().searchNear(getUserId());
    }
}
