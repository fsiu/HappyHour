package com.happyhour.com.happyhour.service;

import com.happyhour.com.happyhour.model.Users;

/**
 * Created by fsiu on 5/16/14.
 */
public abstract class BaseHappyHourUserSpiceRequest extends BaseSpiceRequest <Users, HappyHour>{

    final String userId;

    public BaseHappyHourUserSpiceRequest(final String userId) {
        super(Users.class, HappyHour.class);
        this.userId = userId;
    }

    @Override
    public Object getCacheKey() {
        return this.hashCode();
    }

    String getUserId() {
        return this.userId;
    }
}
