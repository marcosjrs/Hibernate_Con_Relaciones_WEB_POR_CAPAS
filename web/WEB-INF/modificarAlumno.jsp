<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Modificar Alumno</title>
    </head>
    <body>
        Modificar Alumno
        <br/>
        <form name ="form1" action="${pageContext.request.contextPath}/modificar" method="post">
            Id Alumno: <input type="text" name="idAlumno" value="${alumno.idAlumno}" readonly="readonly">
            <br/>
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}">
            <br/>
            Apellido Paterno: <input type="text" name="apellidoPaterno" value="${alumno.apellidoPaterno}">
            <br/>
            Apellido Materno: <input type="text" name="apellidoMaterno" value="${alumno.apellidoMaterno}">
            <br/>

            <br/>
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}">
            <br/>
            <br/>
            Datos Contacto:
            <br/>
            email: <input type="text" name="email" value="${alumno.contacto.email1}">
            <br/>
            telefono: <input type="text" name="telefono" value="${alumno.contacto.telefono}">
            <br/>

            <input type="submit" name="modificar" value="modificar">
            <input type="submit" name="eliminar" value="eliminar">

            <!--  No necesitamos manejar valores ocultos
            ya que nos apoyaremos del objeto en sesion para
            la edicion -->
        </form>
    </body>
</html>
