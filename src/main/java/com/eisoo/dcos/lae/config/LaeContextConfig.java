package com.eisoo.dcos.lae.config;

/**
 * Created by xyc on 2017/6/15.
 */
public class LaeContextConfig {

    private static String baseURi = "172.20.0.223/lae";

    public static void setBaseUri(String baseUri){
        baseURi = baseUri;
    }

    public static String getBaseUri(){
        return baseURi;
    }

}
