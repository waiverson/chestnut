package com.abear.chestnut.models;

/**
 * Created by Administrator on 2017/6/15.
 */
public interface HttpResponse extends Response, HttpMessage {
    int getStatus();
}
