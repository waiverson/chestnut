package com.eisoo.dcos.lae.models;

/**
 * Created by xyc on 2017/6/19.
 */
public final class CommandModel {

    private HttpMethod method;
    private String path;

    public CommandModel(HttpMethod method, String path) {
        this.method = method;
        this.path = path;
    }

    public String getMethod() {return method.text();}

    public String getPath() {return path;}

}
