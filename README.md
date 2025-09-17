# Semana6 - Microservicio de Videojuegos

## Objetivo
Este proyecto es un **microservicio REST** desarrollado en **Spring Boot 3** que permite gestionar información sobre videojuegos. Su finalidad es exponer endpoints para consultar videojuegos por diferentes criterios como ID, título o plataforma.

---

## Funcionalidades principales

- Obtener todos los videojuegos disponibles.
- Obtener un videojuego por su **ID**.
- Obtener un videojuego por su **título**.
- Obtener un videojuego por su **plataforma**.

Todos los endpoints devuelven respuestas HTTP adecuadas: `200 OK` cuando hay resultados, `204 No Content` si no hay datos y `404 Not Found` cuando no se encuentra un registro específico.

---

## Endpoints disponibles

| Método | Ruta | Descripción |
|--------|-----|-------------|
| GET    | /videojuego | Obtiene todos los videojuegos |
| GET    | /videojuego/id/{id} | Obtiene un videojuego por ID |
| GET    | /videojuego/titulo/{titulo} | Obtiene un videojuego por título |
| GET    | /videojuego/plataforma/{plataforma} | Obtiene un videojuego por plataforma |

---

## Seguridad
Este microservicio utiliza **Basic Auth**. Las credenciales por defecto para acceder a los endpoints son:

- **Usuario:** `user`
- **Contraseña:** `password`

> Asegúrate de enviar las credenciales en tu cliente HTTP (Postman, curl, etc.) para obtener respuesta.

---

## Requisitos

- Java 17
- Maven
- Spring Boot 3
- H2 Database (para pruebas locales)
- Eureka Server (opcional, si se integra con microservicios)
- Config Server (opcional, para propiedades centralizadas)

---

## Ejecución

1. Clonar el repositorio:
```bash
git clone <URL_DEL_REPO>
```
2. Entrar al proyecto:

3. Compilar y ejecutar:
```bash
mvn clean spring-boot:run
```

4. Acceder a los endpoints con un cliente HTTP (Postman, curl) usando:
http://localhost:8080/videojuego


