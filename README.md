# Refactored Spring Boot backend

## Что внутри
- Spring Boot
- Spring Web / REST
- Spring Data JPA + Hibernate
- Spring Data JDBC
- Spring Security
- PostgreSQL

## Структура
- `entity/Cabinet` — JPA-сущность для кабинетов
- `repository/CabinetRepository` — JPA-репозиторий
- `service/CabinetService` — сервисный слой
- `controller/CabinetController` — REST API для кабинетов
- `jdbc/ReserveJdbc` — модель для Spring Data JDBC
- `jdbc/ReserveJdbcRepository` — JDBC-репозиторий
- `controller/ReserveJdbcController` — REST API для резервов
- `config/SecurityConfig` — базовая настройка безопасности

## Быстрый старт
1. Создай PostgreSQL базу, например `postgres`.
2. Проверь `src/main/resources/application.properties`.
3. Запусти:
   ```bash
   mvn clean spring-boot:run
   ```

## Полезные URL
- `GET /api/cabinets`
- `POST /api/cabinets`
- `GET /api/jdbc/reserves`
- `POST /api/jdbc/reserves`

## Пример POST /api/cabinets
```json
{
  "id": "2-1",
  "places": 30,
  "compPlaces": 10
}
```

## Пример POST /api/jdbc/reserves
```json
{
  "studentId": "i00s0001",
  "reserveDate": "2025-12-17",
  "cabinetIds": "[\"2-1\",\"3-2\"]"
}
```
