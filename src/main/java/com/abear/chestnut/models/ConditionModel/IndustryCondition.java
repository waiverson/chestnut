package com.abear.chestnut.models.ConditionModel;

import com.abear.chestnut.models.IndustryModel.Industry;
import com.abear.chestnut.util.Jsons;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyc on 2017/6/16.
 */


public class IndustryCondition implements Condition{

    private Industry industry;

    public IndustryCondition(Industry industry) {
        this.industry = industry;
    }

    @Override
    public String getHeaders() {
        return null;
    }

    @Override
    public Map<String, ?> getParams() {

        return new HashMap<String, Object>() {
            {
                put("industry_id", industry.getId());
            }
        };
    }

    @Override
    public String getBody(){
        return Jsons.toJson(this.industry);
    }
}
