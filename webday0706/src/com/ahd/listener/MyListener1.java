package com.ahd.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener1 implements ServletContextListener {
   // private xxxDao

    @Override
    /**
     * 初始化方法
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //项目启动时可以在这里将查询频率高的数据加载出来
        System.out.println("对象初始化创建");
    }

    @Override
    /**
     * 销毁方法
     */
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("对象销毁");
    }
}
