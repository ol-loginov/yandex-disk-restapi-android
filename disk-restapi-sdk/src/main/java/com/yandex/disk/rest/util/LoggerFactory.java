/*
 * (C) 2015 Yandex LLC (https://yandex.com/)
 *
 * The source code of Java SDK for Yandex.Disk REST API
 * is available to use under terms of Apache License,
 * Version 2.0. See the file LICENSE for the details.
 */

package com.yandex.disk.rest.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.util.Log;

import com.yandex.android.rest.BuildConfig;

public class LoggerFactory {

    @NonNull
    public static Logger getLogger(@NonNull final Class clazz) {
        final org.slf4j.Logger delegate = org.slf4j.LoggerFactory.getLogger(clazz);

        return new Logger() {

            @Override
            public boolean isDebugEnabled() {
                return BuildConfig.DEBUG;
            }

            @Override
            public void debug(@NonNull String message) {
                delegate.debug(message);
            }

            @Override
            public void debug(@NonNull String message, @Nullable Throwable throwable) {
                delegate.debug(message, throwable);
            }

            @Override
            public void info(@NonNull String message) {
                delegate.info(message);
            }

            @Override
            public void info(@NonNull String message, @Nullable Throwable throwable) {
                delegate.info(message, throwable);
            }

            @Override
            public void warn(@NonNull String message) {
                delegate.warn(message);
            }

            @Override
            public void warn(@NonNull String message, @Nullable Throwable throwable) {
                delegate.warn(message, throwable);
            }

            @Override
            public void error(@NonNull String message) {
                delegate.error(message);
            }

            @Override
            public void error(@NonNull String message, @Nullable Throwable throwable) {
                delegate.error(message, throwable);
            }
        };
    }
}
