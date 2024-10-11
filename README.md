Backend Fondos

#Descripción
Este proyecto es una API RESTful desarrollada en Spring Boot para gestionar fondos de inversión. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre los fondos, además de buscar fondos por nombre.

#Características principales
Gestión de fondos: CRUD de fondos de inversión.
Búsqueda por nombre: Filtrado de fondos según su nombre.
Persistencia: Base de datos relacional usando PostgreSQL.
Dependencias principales:
Spring Boot
Spring Data JPA
PostgreSQL
Hibernate
Requisitos
Java 20 o superior.
Maven 3.8.1 o superior.
PostgreSQL como base de datos.
IDE recomendado: IntelliJ IDEA o Eclipse con soporte para Spring.
Instalación y ejecución
1. Clonar el repositorio
bash
Copiar código
git clone https://github.com/tu-usuario/backend-fondos.git
cd backend-fondos
2. Configurar la base de datos
Asegúrate de que PostgreSQL esté instalado y ejecutándose en tu máquina local o en un servidor accesible. Luego, crea una base de datos:

sql
Copiar código
CREATE DATABASE fondos_db;
3. Configuración del archivo application.properties
Abre el archivo src/main/resources/application.properties y modifica los parámetros de conexión a la base de datos:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/fondos_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
4. Compilar y ejecutar la aplicación
bash
Copiar código
mvn clean install
mvn spring-boot:run
5. Acceder a la API
La API estará disponible en http://localhost:8081. Puedes usar herramientas como Postman o curl para realizar solicitudes a la API.

Ejemplo de una solicitud GET para listar todos los fondos:

bash
Copiar código
curl -X GET http://localhost:8081/api/fondos
Endpoints
Fondos
Método	Endpoint	Descripción
GET	/api/fondos	Listar todos los fondos
GET	/api/fondos/{id}	Obtener fondo por ID
POST	/api/fondos	Crear un nuevo fondo
PUT	/api/fondos/{id}	Actualizar un fondo existente
DELETE	/api/fondos/{id}	Eliminar un fondo
Búsqueda de fondos por nombre
Método	Endpoint	Descripción
GET	/api/fondos/buscar?nombre={nombre}	Buscar fondos por nombre
Estructura del Proyecto
/src/main/java/com/btg: Contiene el código fuente de la aplicación.
/controllers: Controladores REST.
/models: Entidades JPA.
/services: Lógica de negocio.
/repositories: Repositorios JPA.
/src/main/resources: Archivos de configuración y propiedades.
application.properties: Configuración de la base de datos y otros ajustes.
Tecnologías Utilizadas
Java 20
Spring Boot 2.7.0
Spring Data JPA
PostgreSQL
Maven
Autor
Luis - GitHub
