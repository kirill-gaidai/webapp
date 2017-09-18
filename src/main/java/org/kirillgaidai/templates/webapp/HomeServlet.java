package org.kirillgaidai.templates.webapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/index.html"})
public class HomeServlet extends HttpServlet {

    final private static Logger LOGGER = LogManager.getLogger(HomeServlet.class);

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("entering doGet method");
        AppClass appClass = new AppClass();
        String message = appClass.getMessage();
        request.setCharacterEncoding("utf-8");
        request.setAttribute("message", message);
        request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
    }

}
