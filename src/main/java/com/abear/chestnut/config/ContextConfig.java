package com.abear.chestnut.config;

/**
 * Created by xyc on 2017/6/15.
 */
public class ContextConfig {

    private static String baseURi = "xxx.xxx.xxx.xxx/chestnut/v1.0/";

    public static void setBaseUri(String baseUri){
        baseURi = baseUri;
    }

    public static String getBaseUri(){
        return baseURi;
    }

}
