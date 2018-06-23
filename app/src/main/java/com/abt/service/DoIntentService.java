package com.abt.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * @描述： @DoIntentService
 * @作者： @黄卫旗
 * @创建时间： @23/06/2018
 */
public class DoIntentService extends IntentService {

    public DoIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
