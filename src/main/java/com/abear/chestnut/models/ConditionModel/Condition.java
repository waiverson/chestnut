package com.abear.chestnut.models.ConditionModel;

import java.util.Map;

/**
 * Created by xyc on 2017/6/16.
 */
public interface Condition {

    public String getHeaders();

    public Map<String, ?> getParams();

    public String getBody();

}
