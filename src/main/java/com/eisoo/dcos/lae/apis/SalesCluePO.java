package com.eisoo.dcos.lae.apis;

import com.eisoo.dcos.lae.models.CommandModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.eisoo.dcos.lae.models.HttpMethod.*;

/**
 * Created by xyc on 2017/6/16.
 */
public class SalesCluePO {
    private static Map<String, CommandModel> indexPaths;
    static {
        Map<String, CommandModel> paths = new HashMap<>();
        paths.put("create", new CommandModel(POST,"/org/clue/add"));
        paths.put("getAll", new CommandModel(GET,"/org/clue/list"));
        paths.put("delete", new CommandModel(POST,"/org/clue/del"));
        indexPaths = Collections.unmodifiableMap(paths);
    }

    public static CommandModel getCommandInfo(String key){
        return indexPaths.get(key);
    }
}
