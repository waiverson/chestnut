package com.eisoo.dcos.lae.action;


import com.eisoo.dcos.lae.config.LaeContextConfig;
import com.eisoo.dcos.lae.models.ConditionModel.Condition;
import com.eisoo.dcos.lae.util.URLs;
import io.restassured.response.Response;
import com.eisoo.dcos.lae.apis.*;

import static io.restassured.RestAssured.given;

/**
 * Created by xyc on 2017/6/15.
 */

public class SalesClueAction {

    private static String createPath = "create";

    public static Response createSalesClue(String name, ExecStatus status, Condition industry) {
        String url = URLs.join(LaeContextConfig.getBaseUri(), SalesCluePO.getPath(createPath));
        Response resp =
                given().param("name", name).
                        param("status", status.getId()).
                        param("indstry_id", industry.getContent()).
                        when().post(url).
                        then().
                        extract().
                        response();
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
