# Proyecto de Notas con Spring y Thymeleaf

- - -  

Este es un proyecto web sencillo que permite crear, listar, actulizar y eliminar notas para esto se utilizaran las tecnológias.

- Spring Boot

- Thymeleaf

- JPA / Hibernate

- Bootstrap

Para poder crear es proyecto se necesitara saber de conceptos basicos como que es la arquitectura MVC, como funciona el protocolo HTML. Tambien se vera una introducción a Spring Boot y Thymeleaf.



# ¿Qué es MVC?

En líneas generales, MVC es una propuesta de arquitectura del software utilizada para separar el código por sus distintas responsabilidades, manteniendo distintas capas que se encargan de hacer una tarea muy concreta, lo que ofrece beneficios diversos.



### Model

**Es la capa donde se trabaja con los datos**, por tanto contendrá mecanismos para acceder a la información y también para actualizar su estado. Los datos los tendremos habitualmente en una base de datos, por lo que en los modelos tendremos todas las funciones que accederán a las tablas y harán los correspondientes *selects, updates, inserts*, etc

### View

Las vistas, como su nombre nos hace entender, contienen el código de nuestra aplicación que va a producir la visualización de las interfaces de usuario, o sea, el código que nos permitirá renderizar los estados de nuestra aplicación en HTML. En las vistas nada más tenemos los códigos HTML y Thymeleaf que nos permite **mostrar la salida**

### Controller

Es una capa que sirve de **enlace entre las vistas y los modelos, respondiendo a los mecanismos que puedan requerirse para implementar las necesidades de nuestra aplicación.** 



![](http://codingornot.com/wp-content/uploads/2017/10/mvc-modelo-vista-controlador.png)



# Métodos de petición Http

HTTP define un conjunto de **métodos de petición** para indicar la acción que se desea realizar para un recurso determinado

### GET

El método `GET` solicita una representación de un recurso específico. Las peticiones que usan el método `GET` sólo deben recuperar datos.

### POST

El método `POST` se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.

### PUT

El modo `PUT` reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

### DELETE

El método `DELETE` borra un recurso en específico.



<img title="" src="https://joanluk.files.wordpress.com/2015/08/blog-rest_.jpg" alt="" width="479" data-align="center">

En el caso de los servicios REST utilizamos todos estos verbos mediante peticines AJAX, sin embargo en la aquitectura MVC solo utilizamos POST y GET, esto debido a que el formulario de HTML son los unicos que acepta de manera nativa.



# Spring Boot

Spring Boot es un framework que nos faclita y ahorra tiempo al momento de desarrollar aplicaciones web, debido a que cuenta con varias herramientas como Spring Web, Spring Data Jpa y Spring Security.



# Thymeleaf

El objetivo principal de Thymeleaf es traer elegantes plantillas naturales a su flujo de trabajo de desarrollo: HTML que se puede mostrar correctamente en los navegadores y también funciona como prototipos estáticos, lo que permite una colaboración más sólida en los equipos de desarrollo.



Como empezar a utilizar Spring Boot con Thymeleaf

[Spring MVC Integrando Thymeleaf](http://acodigo.blogspot.com/2017/04/spring-mvc-integrando-thymeleaf.html)




