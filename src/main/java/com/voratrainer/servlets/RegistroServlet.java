package com.voratrainer.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Registro VoraTrainer</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Registro de usuarios - VoraTrainer</h1>");
        out.println("<p>El Servlet está funcionando correctamente.</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String usuario = request.getParameter("usuario");
        String correo = request.getParameter("correo");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Registro recibido</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Datos recibidos correctamente</h1>");
        out.println("<p>Usuario: " + escapeHtml(usuario) + "</p>");
        out.println("<p>Correo: " + escapeHtml(correo) + "</p>");
        out.println("<a href='registro'>Volver al registro</a>");
        out.println("</body>");
        out.println("</html>");
    }

    static String escapeHtml(String valor) {
        if (valor == null) {
            return "";
        }

        return valor.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
