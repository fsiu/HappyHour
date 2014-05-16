package com.happyhour.com.happyhour.service;

import com.happyhour.com.happyhour.service.catalog.UrlCatalog;
import com.octo.android.robospice.retrofit.RetrofitJackson2SpiceService;

/**
 * Created by fsiu on 5/16/14.
 */
public class HappyHourSpiceService extends RetrofitJackson2SpiceService {

    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(HappyHour.class);
    }

    @Override
    protected String getServerUrl() {
        return UrlCatalog.SERVER_ROOT+UrlCatalog.SERVICE_ROOT;
    }
}
