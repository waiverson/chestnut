package com.eisoo.dcos.lae.util;

import com.eisoo.dcos.lae.apis.*;
import com.eisoo.dcos.lae.models.IndustryModel.AbstractDeskIndustry;
import com.eisoo.dcos.lae.models.IndustryModel.HighEducation;
import com.eisoo.dcos.lae.models.IndustryModel.Industry;
import org.junit.Test;

/**
 * Created by xyc on 2017/6/16.
 */
public class JsonsTest {

    @Test
    public void toJsonTest() {
        HighEducation highEduction = new HighEducation();
        highEduction.setYear(HighEducation.createYear.get("min"));
        highEduction.setType(HighEducation.collegeType.get("Other"));
        String rs = Jsons.toJson(highEduction);
        System.out.print(rs);
    }

}
