<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro | VoraTrainer</title>

    <style>
        body {
            background: #101010;
            color: white;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .contenedor {
            background: #202020;
            padding: 35px;
            border-radius: 15px;
            width: 350px;
            box-shadow: 0 0 20px rgba(204, 255, 0, 0.12);
        }

        h1 {
            color: #ccff00;
            text-align: center;
        }

        p {
            text-align: center;
            color: #cccccc;
        }

        label {
            display: block;
            margin-top: 18px;
            margin-bottom: 7px;
        }

        input {
            width: 100%;
            padding: 12px;
            box-sizing: border-box;
            border: 1px solid #555;
            border-radius: 7px;
            background: #303030;
            color: white;
        }

        button {
            width: 100%;
            padding: 13px;
            margin-top: 25px;
            background: #ccff00;
            border: none;
            border-radius: 7px;
            font-weight: bold;
            cursor: pointer;
        }

        button:hover {
            background: #b6e600;
        }
    </style>
</head>

<body>

    <div class="contenedor">

        <h1>VoraTrainer</h1>
        <p>Registro de nuevos usuarios</p>

        <form action="registro" method="POST">

            <label for="usuario">Nombre de usuario</label>
            <input type="text" id="usuario" name="usuario"
                   placeholder="Ingresa tu usuario" required>

            <label for="correo">Correo electrónico</label>
            <input type="email" id="correo" name="correo"
                   placeholder="ejemplo@correo.com" required>

            <button type="submit">Registrarme</button>

        </form>

    </div>

</body>
</html>
