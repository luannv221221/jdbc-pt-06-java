package com.ra.controller;

import com.ra.model.dao.StudentDAO;
import com.ra.model.dao.StudentDAOImpl;
import com.ra.model.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentController",value = "/student")
public class StudentController extends HttpServlet {
    private StudentDAO studentDAO = new StudentDAOImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentDAO.getAll();
        req.setAttribute("students",students);
        req.getRequestDispatcher("views/student.jsp").forward(req,resp);
    }
}
