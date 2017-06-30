package com.eisoo.dcos.lae.action;


import com.eisoo.dcos.lae.config.LaeContextConfig;
import com.eisoo.dcos.lae.models.CommandModel;
import com.eisoo.dcos.lae.models.ConditionModel.Condition;
import com.eisoo.dcos.lae.util.URLs;
import io.restassured.response.Response;
import com.eisoo.dcos.lae.apis.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Created by xyc on 2017/6/15.
 */

public class SalesClueAction {

    private static String  createKey = "create";

    public static String createSalesClue(String name, ExecStatus status, Condition industry) {
        CommandModel command = SalesCluePO.getCommandInfo(createKey);
        String url = URLs.join(LaeContextConfig.getBaseUri(), command.getPath());
        Map<String,Object> parametersMap = new HashMap<String, Object>();
        parametersMap.put("name", name);
        parametersMap.put("status", status.getId());
        parametersMap.putAll(industry.getParams());
        String resp =
                given().params(parametersMap).
                        when().
                        request(command.getMethod(), url).
                        asString();
        return resp;

    }

    public enum ExecStatus {

        VALIDATING("正在验证", 0),
        VALIDATED("已验证", 10),
        Imported("已导入", 20),
        EXECUTION("执行良好", 30),
        CLOSED("已关闭", 40);

        private String name;
        private int id;

        private ExecStatus(String name, int id){
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }


}
