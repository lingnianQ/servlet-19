package tech.aistar.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 本类用来演示: 转发到登录的界面
 *
 * @author: Q
 * @date: 2021/10/16 2:31 下午
 */
@WebServlet(urlPatterns = "/user/loginView")
public class UserLoginViewController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //转发到/WEB-INF/xx.jsp
        req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req,resp);
    }
}

