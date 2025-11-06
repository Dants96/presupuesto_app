# 💰 Presupuesto App Backend

Backend reactivo desarrollado en **Spring Boot** para la gestión de presupuestos y gastos personales.  
Este servicio expone una API REST para registrar, consultar y administrar presupuestos y gastos, utilizando una arquitectura moderna y no bloqueante con **Spring WebFlux** y **R2DBC**.

---

## 🚀 Tecnologías principales

| Componente | Tecnología |
|-------------|-------------|
| Lenguaje | Java 17 |
| Framework | Spring Boot 3.5.7 |
| Paradigma | Reactivo (WebFlux) |
| Base de datos | PostgreSQL |
| ORM Reactivo | Spring Data R2DBC |
| Build tool | Gradle |
| Librerías adicionales | Lombok, Reactor Test, DevTools |

---

## 🏗️ Estructura del proyecto

```
src/
 ├── main/
 │   ├── java/com/presupuesto_app/
 │   │   ├── config/            # Configuraciones (callbacks, conexión, etc.)
 │   │   ├── controller/        # Controladores REST (Endpoints)
 │   │   ├── model/             # Entidades del dominio
 │   │   ├── repository/        # Repositorios R2DBC
 │   │   ├── service/           # Lógica de negocio
 │   │   └── PresupuestoAppApplication.java
 │   └── resources/
 │       ├── application.properties
 │       └── schema.sql (opcional)
 └── test/
     └── ...
```

---

## ⚙️ Configuración de la base de datos (PostgreSQL)

Asegúrate de tener una base de datos creada antes de correr la app

En tu archivo `src/main/resources/application.properties`:

```properties
spring.application.name=presupuesto_app
server.port=8080

# Configuración R2DBC para PostgreSQL
spring.r2dbc.url=r2dbc:postgresql://localhost:5432/ppappdb
spring.r2dbc.username=postgres
spring.r2dbc.password=tu_contraseña

# Pool de conexiones (opcional)
spring.r2dbc.pool.initial-size=5
spring.r2dbc.pool.max-size=20

# Logging SQL (opcional para depuración)
logging.level.org.springframework.r2dbc.core=DEBUG
```

> ⚠️ Asegúrate de **NO** usar el driver JDBC (`jdbc:`), sino el driver R2DBC (`r2dbc:`).

---

## 🧪 Ejecución del proyecto

### 🛠️ Compilar y limpiar el proyecto:
```bash
./gradlew clean build
```

### ▶️ Ejecutar la aplicación:
```bash
./gradlew bootRun
```

La API quedará disponible en:
```
http://localhost:8080
```

---

## 📬 Endpoints esperados

---

## 📦 Ejemplo de JSON para crear un gasto

---

## 🧑‍💻 Autor

**Desarrollado por:** [Dants96]  
**Lenguaje:** Java 17  
**Framework:** Spring Boot WebFlux  
**Base de datos:** PostgreSQL  

---

## 🏁 Licencia

Este proyecto está bajo la licencia **MIT** — eres libre de usarlo, modificarlo y distribuirlo con atribución.
