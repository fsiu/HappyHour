package com.happyhour.com.happyhour.service;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

/**
 * Created by fsiu on 5/16/14.
 */
public abstract class BaseSpiceRequest<T,V>  extends RetrofitSpiceRequest<T,V> implements CacheableSpiceRequest{

    public BaseSpiceRequest(Class<T> originalClazz, Class<V> retrofittedClazz) {
        super(originalClazz, retrofittedClazz);
    }
}
