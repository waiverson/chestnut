package com.abear.chestnut.util;

/**
 * Created by xyc on 2017/6/16.
 */
public final class Precondition {

    public static String checkNotNullOrEmpty(final String reference, final Object errorMessage) {
        if (isNullOrEmpty(reference)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }

        return reference;
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }

    private Precondition() {}
}
