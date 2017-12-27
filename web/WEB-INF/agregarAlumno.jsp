<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        Agregar Alumno
        <br/>
        <form name ="form1" action="${pageContext.request.contextPath}/agregar" method="post">
            Nombre: <input type="text" name="nombre" >
            <br/>
            Apellido Paterno: <input type="text" name="apellidoPaterno">
            <br/>
            Apellido Materno: <input type="text" name="apellidoMaterno">
            <br/>
            <br/>
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle">
            <br/>
            <br/>
            Datos Contacto:
            <br/>
            email: <input type="text" name="email">
            <br/>
            telefono: <input type="text" name="telefono">
            <br/>
            <input type="submit" name="agregar" value="Agregar">
        </form>
    </body>
</html>
