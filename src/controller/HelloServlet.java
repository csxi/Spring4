package controller;

import dao.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paul on 2018/6/12.
 */
@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              /*ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");*/
        WebApplicationContext applicationContext =
                WebApplicationContextUtils.
                        getWebApplicationContext(this.getServletContext());
        IUserDao iUserDao = (IUserDao) applicationContext.getBean("UserService");
        iUserDao.loginUser();
    }
}
