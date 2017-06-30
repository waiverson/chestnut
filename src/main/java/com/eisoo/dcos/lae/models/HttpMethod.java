package com.eisoo.dcos.lae.models;

/**
 * Created by xyc on 2017/6/19.
 */
public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String text;

    HttpMethod(final String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static HttpMethod methodOf(final String method) {
        HttpMethod[] values = HttpMethod.values();
        for (HttpMethod value : values) {
            if (value.text.equalsIgnoreCase(method)) {
                return value;
            }
        }

        throw new IllegalArgumentException("unknown HTTP method: " + method);
    }
}

