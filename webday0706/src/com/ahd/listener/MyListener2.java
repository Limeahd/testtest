package com.ahd.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener2 implements ServletContextAttributeListener {
    @Override
    /**
     * 监听属性添加的操作
     */
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        System.out.println("添加了"+name+" "+value);
    }

    @Override
    /**
     *监听属性替换的操作
     */
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        ServletContext context = servletContextAttributeEvent.getServletContext();
        Object value = context.getAttribute(name);
        System.out.println("替换后"+name+" "+value);
    }

    @Override
    /**
     * 监听属性移除的操作
     */
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
    }


}
