VoraTrainerWeb



1\. Descripción del proyecto



VoraTrainerWeb es un módulo web desarrollado en Java para el proyecto VoraTrainer. Su objetivo es implementar y probar el proceso de registro de usuarios mediante tecnologías web basadas en Java.



El módulo utiliza formularios HTML, Java Servlets, JSP y los métodos HTTP GET y POST.



2\. Tecnologías utilizadas



Java JDK 21.



Apache Maven 3.10.0.



Apache Tomcat 10.1.61.



Jakarta Servlet API 6.0.0.



Jakarta JSP API 3.1.1.



JUnit 4.13.2.



HTML y CSS.



3\. Requisitos previos



Para ejecutar el proyecto se necesita:



Tener instalado Java JDK 21.



Tener instalado Apache Maven.



Tener instalado Apache Tomcat 10.1 o superior compatible con Jakarta Servlet 6.



Contar con un editor de código, como Visual Studio Code.



4\. Estructura del proyecto



VoraTrainerWeb/

├── documentacion/

│   ├── casos\_de\_uso/

│   ├── diseños\_y\_prototipos/

│   ├── evidencias/

│   ├── historias\_de\_usuario/

│   ├── metodologia/

│   └── modelo\_de\_datos/

├── src/

│   ├── main/

│   │   └── webapp/

│   └── test/

├── pom.xml

├── .gitignore

└── README.md



5\. Instalación y compilación



Clonar el repositorio:



git clone https://github.com/JuanEsteban1913/VoraTrainerWeb.git



Ingresar a la carpeta del proyecto:



cd VoraTrainerWeb



Compilar y ejecutar las pruebas:



mvn clean test



Generar el archivo WAR:



mvn clean package



El archivo generado se encuentra en:



target/VoraTrainerWeb.war



6\. Ejecución en Apache Tomcat



Generar el archivo WAR mediante Maven.



Copiar target/VoraTrainerWeb.war a la carpeta webapps de Apache Tomcat.



Iniciar Tomcat.



Abrir el navegador y acceder a:



http://localhost:8080/VoraTrainerWeb/



7\. Funcionalidad implementada



El módulo permite:



Visualizar el formulario de registro.



Enviar información mediante HTTP POST.



Recibir los parámetros de usuario y correo electrónico en el Servlet.



Mostrar una respuesta de confirmación.



Regresar al formulario de registro.



El Servlet está asociado a la ruta /registro.



8\. Pruebas



Se implementaron pruebas unitarias con JUnit para verificar el comportamiento de métodos auxiliares del Servlet, incluyendo el tratamiento de valores nulos y el escape de caracteres HTML.



Resultado de la última ejecución:



Pruebas ejecutadas: 3.



Fallidas: 0.



Errores: 0.



Omitidas: 0.



Comando utilizado:



mvn clean test



9\. Documentación y evidencias



La carpeta documentacion contiene:



Metodología y plan de trabajo.



Casos de uso.



Historias de usuario.



Modelo de datos y diccionario de datos.



Diseños y prototipos web.



Evidencias de funcionamiento y pruebas.



10\. Repositorio



GitHub:



https://github.com/JuanEsteban1913/VoraTrainerWeb



Proyecto: VoraTrainerWeb

Evidencia: GA7-220501096-AA2-EV02

Tecnología principal: Java Web

Entorno de ejecución: Apache Tomcat

