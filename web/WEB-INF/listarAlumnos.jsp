<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Listar Alumnos</title>
    </head>
    <body>
        Listar Alumnos
        <br/>
        <a href="${pageContext.request.contextPath}/formularioalta">Agregar alumno</a>
        <br/>
        <table border="1">
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Domicilio</th>
                <th>Tel&eacute;fono</th>
                <th>Email</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/modificar?idAlumno=${alumno.idAlumno}">
                            ${alumno.idAlumno}
                        </a></td>
                    <td>${alumno.nombre}</td>
                    <td>${alumno.apellidoPaterno }</td>
                    <td>${alumno.apellidoMaterno }</td>
                    <td>${alumno.domicilio.calle }</td>
                    <td>${alumno.contacto.telefono }</td>
                    <td>${alumno.contacto.email1 }</td>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>