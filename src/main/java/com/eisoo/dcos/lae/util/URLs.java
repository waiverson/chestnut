package com.eisoo.dcos.lae.util;

import java.net.MalformedURLException;
import java.net.URL;

import static com.eisoo.dcos.lae.util.Precondition.*;

/**
 * Created by xyc on 2017/6/15.
 */
public class URLs {

    private static final String SEPARATOR = "/";

    public static String toBase(final String baseUri) {
        if (baseUri.endsWith(SEPARATOR)) {
            return baseUri;
        }

        return baseUri + SEPARATOR;
    }

    public static String join(final String base, final String path) {
        String joinPath = toJoinPath(path);
        if (base.endsWith(SEPARATOR)) {
            return base + joinPath;
        }

        if (joinPath.isEmpty()) {
            return base;
        }

        return base + SEPARATOR + joinPath;
    }

    private static String toJoinPath(final String path) {
        if (isNullOrEmpty(path)) {
            return "";
        }

        if (path.startsWith(SEPARATOR)) {
            return path.substring(1);
        }

        return path;
    }

    public static URL toUrl(final String url) {
        try {
            return new URL(checkNotNullOrEmpty(url, "URL should not be null"));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private URLs() {}
}
