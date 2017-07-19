package com.abear.chestnut.apis;

import com.abear.chestnut.models.CommandModel;
import com.abear.chestnut.models.HttpMethod;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyc on 2017/6/16.
 */
public class SalesCluePO {
    private static Map<String, CommandModel> indexPaths;
    static {
        Map<String, CommandModel> paths = new HashMap<>();
        paths.put("create", new CommandModel(HttpMethod.POST,"/sales/salesclue"));
        paths.put("getAll", new CommandModel(HttpMethod.GET,"/sales/salesclue"));
        paths.put("delete", new CommandModel(HttpMethod.POST,"/sales/salesclue"));
        indexPaths = Collections.unmodifiableMap(paths);
    }

    public static CommandModel getCommandInfo(String key){
        return indexPaths.get(key);
    }
}
