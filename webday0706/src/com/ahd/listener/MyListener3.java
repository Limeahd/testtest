package com.ahd.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

//@WebListener
public class MyListener3 implements ServletRequestListener {
    /**
     * 用来监听ServletRequest对象
     *
     */

    @Override
    /**
     * 初始化
     */
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("发送请求");
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
    }

    @Override
    /**
     * 销毁操作
     */
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("求情结束");
    }


}
