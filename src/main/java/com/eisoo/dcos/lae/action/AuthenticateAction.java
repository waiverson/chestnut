package com.eisoo.dcos.lae.action;

import com.eisoo.dcos.lae.apis.Index;
import com.eisoo.dcos.lae.config.LaeContextConfig;
import com.eisoo.dcos.lae.config.LaeUserConfig;

import static io.restassured.RestAssured.*;

import com.eisoo.dcos.lae.util.URLs;
import io.restassured.response.Response;


/**
 * Created by xyc on 2017/6/15.
 */
public class AuthenticateAction {

    private Response resp;
    private String exprGetToken = "result.token";
    private String exprGetUserId = "result.uid";
    private String loginPathKey = "index";

    public AuthenticateAction(LaeUserConfig user){
        this.login(user);
    }

    public String getToken() {
        String token = resp.path(exprGetToken);
        return token;
    }

    public int getUserId() {
        int id = resp.path(exprGetUserId);
        return id;
    }

    public void login(LaeUserConfig user) {
        String url = URLs.join(LaeContextConfig.getBaseUri(), Index.getPath(loginPathKey));
        this.resp =
                given().param("user", user.getUserName()).
                        param("password", user.getPwd()).
                        when().post(url).
                        then().
                        extract().
                        response();
    }

    public static void logout(LaeUserConfig user) {
        // todo
    }
}
