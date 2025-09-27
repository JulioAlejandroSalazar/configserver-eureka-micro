# Semana6 - Microservicio de Videojuegos

## Objetivo
Este proyecto es un **microservicio REST** desarrollado en **Spring Boot 3** que permite gestionar información sobre videojuegos. Su finalidad es exponer endpoints para consultar videojuegos por diferentes criterios como ID, título o plataforma.  

El microservicio está preparado para funcionar en un **ecosistema de microservicios**, integrando:

- **Eureka Server**: Para el registro y descubrimiento de servicios.
- **Config Server**: Para centralizar la configuración de los microservicios.
- **Kafka**: Para publicar y consumir eventos relacionados con videojuegos, como actualizaciones o registros de nuevos títulos.

---

## Funcionalidades principales

- Obtener todos los videojuegos disponibles.
- Obtener un videojuego por **ID**.
- Obtener un videojuego por **título**.
- Obtener un videojuego por **plataforma**.
- Publicar eventos en **Kafka** al crear o actualizar un videojuego.
- Escuchar eventos de otros microservicios a través de **Kafka**.

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

## Kafka

El microservicio está integrado con **Apache Kafka** para el manejo de eventos:

- **Productor:** Publica eventos cuando se crea o actualiza un videojuego.
- **Consumidor:** Escucha eventos provenientes de otros microservicios.

---

## Seguridad
Este microservicio utiliza **Basic Auth**. Las credenciales por defecto para acceder a los endpoints son:

- **Usuario:** `user`
- **Contraseña:** `password`

---

## Requisitos

- Java 17
- Maven
- Spring Boot 3
- H2 Database (para pruebas locales)
- **Eureka Server** (para registro y descubrimiento de microservicios)
- **Config Server** (para propiedades centralizadas)
- Apache Kafka (broker y topics configurados)

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


