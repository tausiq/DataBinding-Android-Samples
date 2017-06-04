package com.genericslab.databinding_android_samples.data;

import java.util.Locale;

/**
 * Created by shahab on 6/4/17.
 */

public class DataSource {

    private String message;

    public DataSource(String message) {
        this.message = message;
    }

    public String getMessage() {
        return String.format(Locale.US, "Hello %s!", message);
    }

    public static DataSource get(String message) {
        return new DataSource(message);
    }
}
