package com.in;

import com.in.model.States;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectStateservlet",
        urlPatterns = "/SelectState"
)
public class SelectStateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String state = req.getParameter("Type");

        MetroService metroservice = new MetroService();
        States l = States.valueOf(state);

        List cities = metroservice.getCities(l);

        req.setAttribute("cities", cities);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
