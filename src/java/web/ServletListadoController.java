/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import service.AlumnosService;

/**
 *
 * @author MJRS
 */
@WebServlet(name = "listado", urlPatterns = {"/listado"})
public class ServletListadoController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. Nos comunicamos con la capa de servicio
        AlumnosService servicioAlumnos = new AlumnosService();

        //2. Recuperamos todos los alumnos
        List<Alumno> alumnos = servicioAlumnos.listarAlumnos();

        //3. Compartimos la informacion (Modelo) con la vista
        request.setAttribute("alumnos", alumnos);

        //4. Seleccionamos la vista a mostrar la info de alumnos
        request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servet en cargado de recibir la petición de listar alumnos";
    }

}
