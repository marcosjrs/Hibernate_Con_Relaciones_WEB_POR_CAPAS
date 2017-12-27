package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import model.Contacto;
import model.Domicilio;
import service.AlumnosService;

@WebServlet(name = "agregar", urlPatterns = {"/agregar"})
public class ServletAgregarController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
         //1. Recuperamos los parametros del formulario
        String nombre = request.getParameter("nombre");
        String apellidoPaterno = request.getParameter("apellidoPaterno");
        String apellidoMaterno = request.getParameter("apellidoMaterno");
        String calle = request.getParameter("calle");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");

        //2. Llenamos el objeto DTO de Alumno a insertar
        //Creamos el objeto Domicilio
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setVersion(0);
        domicilio.setDeleted(0);

        //Creamos el objeto de Contacto
        Contacto contacto = new Contacto();
        contacto.setEmail1(email);
        contacto.setTelefono(telefono);
        contacto.setVersion(0);
        contacto.setDeleted(0);

        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellidoPaterno(apellidoPaterno);
        alumno.setApellidoMaterno(apellidoMaterno);
        alumno.setVersion(0);//llenamos con valores por default
        alumno.setDeleted(0);//estos son campos requeridos
        //Inyectamos las depedencias de los objetos Domicilio y Contacto
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);

        //3. Nos apoyamos de la capa de servicio
        AlumnosService servicioAlumnos = new AlumnosService();
        servicioAlumnos.guardarAlumno(alumno);

        //4. Redireccionamos a la pagina de inicio
        //ya que de lo contrario tendriamos q volver a cargar la lista de alumnos
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    }

}
