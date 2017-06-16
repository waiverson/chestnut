package com.eisoo.dcos.lae.apis;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Index {

    private static Map<String, String> indexPaths;
    static {
        Map<String, String> paths = new HashMap<>();
        paths.put("login", "/auth/login");
        paths.put("logout", "/auth/user/logout");
        indexPaths = Collections.unmodifiableMap(paths);
    }

    public static String getPath(String key){
        return indexPaths.get(key);
    }
}
