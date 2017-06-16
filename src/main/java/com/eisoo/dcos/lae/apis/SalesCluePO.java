package com.eisoo.dcos.lae.apis;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyc on 2017/6/16.
 */
public class SalesCluePO {
    private static Map<String, String> indexPaths;
    static {
        Map<String, String> paths = new HashMap<>();
        paths.put("create", "/org/clue/add");
        paths.put("getAll", "/org/clue/list");
        paths.put("delete", "/org/clue/del");
        indexPaths = Collections.unmodifiableMap(paths);
    }

    public static String getPath(String key){
        return indexPaths.get(key);
    }
}
