package com.abear.chestnut.util;

import java.util.concurrent.TimeUnit;

/**
 * Created by xyc on 2017/6/15.
 */


public final class Idles {
    public static void idle(final long duration, final TimeUnit unit) {
        try {
            unit.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Idles() {}
}
