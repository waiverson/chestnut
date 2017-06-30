package com.eisoo.dcos.lae.apis;

import com.eisoo.dcos.lae.models.CommandModel;
import static com.eisoo.dcos.lae.models.HttpMethod.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyc on 2017/6/15.
 */
public class Index {

    private static Map<String, CommandModel> indexPaths;
    static {
        Map<String, CommandModel> paths = new HashMap<>();
        paths.put("login", new CommandModel(POST,"/auth/login"));
        paths.put("logout", new CommandModel(POST,"/auth/user/logout"));
        indexPaths = Collections.unmodifiableMap(paths);
    }

    public static CommandModel getCommandInfo(String key){
        return indexPaths.get(key);
    }
}
