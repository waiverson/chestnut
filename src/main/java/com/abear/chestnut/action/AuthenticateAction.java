package com.abear.chestnut.action;

import com.abear.chestnut.config.ContextConfig;
import com.abear.chestnut.config.UserConfig;
import com.abear.chestnut.models.CommandModel;
import com.abear.chestnut.apis.Index;

import static io.restassured.RestAssured.*;

import com.abear.chestnut.util.URLs;
import io.restassured.response.Response;


/**
 * Created by xyc on 2017/6/15.
 */
public class AuthenticateAction {

    private Response resp;
    private String exprGetToken = "result.token";
    private String exprGetUserId = "result.uid";
    private String loginPathKey = "index";

    public AuthenticateAction(UserConfig user){
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

    public void login(UserConfig user) {
        CommandModel command = Index.getCommandInfo(loginPathKey);
        String url = URLs.join(ContextConfig.getBaseUri(), command.getPath());
        this.resp =
                given().param("user", user.getUserName()).
                        param("password", user.getPwd()).
                        when().request(command.getMethod(), url).
                        then().
                        extract().
                        response();
    }

    public static void logout(UserConfig user) {
        // todo
    }
}
