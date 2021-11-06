package tech.aistar.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 本类用来演示: 支持http协议的servlet程序
 *
 * localhost:8081/servlet/day01/two
 *
 * @author: Q
 * @date: 2021/10/16 10:58 上午
 */
@WebServlet(urlPatterns ="/day01/two")
public class TwoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //感受上古神兽的代码 - 后端代码和前端代码放一块
        //servlet也是可以用来作为表示层[view] - 视图

        //1. 设置文档的输出类型
        resp.setContentType("text/html;charset=utf-8");
        //2. 获取文档输出流
        PrintWriter out = resp.getWriter();

        //3. 书写html代码
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("   <head>");
        out.println("       <meta charset='utf-8'>");
        out.println("       <title>百度一下,你就不知道</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("       <h1>编程非常痛苦!</h1>");
        out.println("   </body>");
        out.println("</html>");

        //关闭流 - 昂贵的资源 - 占内存
        out.close();
    }
}
