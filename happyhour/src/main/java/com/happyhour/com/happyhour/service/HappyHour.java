package com.happyhour.com.happyhour.service;

import com.happyhour.com.happyhour.model.Users;
import com.happyhour.com.happyhour.service.catalog.UrlCatalog;

import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by fsiu on 5/16/14.
 */
public interface HappyHour {

    @PUT(UrlCatalog.CHECKIN_URI)
    Users checkin(@Path("user") final String userId);

    @GET(UrlCatalog.SEARCH_NEAR_URI)
    Users searchNear(@Path("user") final String userId);

}
