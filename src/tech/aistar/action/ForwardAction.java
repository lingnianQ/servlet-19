package tech.aistar.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 本类用来演示: 转发
 *
 * @author: Q
 * @date: 2021/10/16 2:55 下午
 */
@WebServlet(urlPatterns = "/day01/forward")
public class ForwardAction extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //将数据放入到request作用域中
        //数据存储的形式是key-value的形式
        req.setAttribute("username","tom");

        //req.getRequestDispatcher("/day01/first.jsp").forward(req,resp);

        //重定向
        //服务器会将这个地址响应给客户端
        //由客户端重新拿着新的请求重新去发送请求
        resp.sendRedirect("/servlet/day01/first.jsp");
    }
}

