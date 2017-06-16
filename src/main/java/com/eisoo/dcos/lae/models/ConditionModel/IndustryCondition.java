package com.eisoo.dcos.lae.models.ConditionModel;

import com.eisoo.dcos.lae.models.IndustryModel.Industry;
import com.eisoo.dcos.lae.util.Jsons;

/**
 * Created by xyc on 2017/6/16.
 */
public class IndustryCondition implements Condition{

    private Industry industry;

    public IndustryCondition(Industry industry) {
        this.industry = industry;
    }

    @Override
    public String getContent(){
        return Jsons.toJson(this.industry);
    }
}
