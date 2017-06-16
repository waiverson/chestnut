package com.eisoo.dcos.lae.models;

import java.util.Map;

/**
 * Created by xyc on 2017/6/15.
 */
public interface HttpMessage extends Message{
    String getVersion();

    Map<String, String> getHeaders();
}
