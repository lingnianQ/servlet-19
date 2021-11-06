package tech.aistar.controller;

import javax.servlet.*;
import java.io.IOException;

/**
 * 本类用来演示: 第一个servlet程序
 *
 * @author: Q
 * @date: 2021/10/16 10:16 上午
 */
public class FirstServlet implements Servlet {// alter+enter

    //手动提供一个构造方法
    //对象一旦被创建[jvm的堆内存中完成],会调用构造方法

    //当第一个请求第一次到达的时候,容器会构建这个servlet的实例

//    public FirstServlet(){
//        System.out.println("FirstServlet空参构造~~~");
//    }

    //servlet的实例一旦被构建完成,那么会立即利用该实例[对象]去调用init方法,来完成初始化的工作
    //所以第一个请求等待的会比较长.
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    /**
     * service - 专门用来负责接收和响应请求的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    /**
     * 当关闭容器的时候,会执行该方法,进行一些收尾的工作.比如关闭资源等.
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }

}

