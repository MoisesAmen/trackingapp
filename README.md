# TrackingApp - Backend

Sistema de seguimiento GPS desarrollado con Spring Boot que permite registrar y consultar rutas con sus coordenadas geográficas.

## Características

- Registro de rutas con múltiples coordenadas
- Consulta de rutas individuales y listado completo
- API RESTful con soporte CORS
- Persistencia en MySQL

## Requisitos Previos

- Java 17 o superior
- MySQL 8.0 o superior
- Maven 3.6 o superior

## Configuración

### Variables de Entorno

Crear un archivo `.env` en la raíz del proyecto con las siguientes variables:

```properties
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tracking_db
DB_USER=your_username
DB_PASSWORD=your_password
```

## Estructura del Proyecto

```
src/main/java/com/example/trackingapp/
├── controller/
│   └── RouteController.java
├── entity/
│   ├── Coordinate.java
│   └── Route.java
├── repository/
│   └── RouteRepository.java
├── service/
│   └── RouteService.java
└── TrackingappApplication.java
```

## API Endpoints

### Rutas

- `POST /api/routes` - Crear nueva ruta
  - Query param: `name` - Nombre de la ruta
  - Body: Array de coordenadas `[{latitude: double, longitude: double}]`

- `GET /api/routes` - Obtener todas las rutas

- `GET /api/routes/{id}` - Obtener ruta por ID

## Instalación y Ejecución

1. Clonar el repositorio:
```bash
git clone https://github.com/tuusuario/trackingapp.git
```

2. Configurar variables de entorno (ver sección de Configuración)

3. Compilar el proyecto:
```bash
mvn clean install
```

4. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

El servidor estará disponible en `http://localhost:8080`

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Jackson

