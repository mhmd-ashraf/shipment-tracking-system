# Shipment Tracking System

A simple **Shipment Tracking Backend** built with **Java and Spring Boot**.

## Features

- Create and manage shipments
- Generate unique tracking numbers
- Search shipments by ID or tracking number
- Update shipment status and current location
- Real-time status updates using WebSocket/STOMP

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- REST API
- WebSocket / STOMP
- H2 Database
- Lombok
- Jakarta Validation
- Maven

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/shipments` | Create shipment |
| GET | `/api/shipments` | Get all shipments |
| GET | `/api/shipments/{id}` | Get shipment by ID |
| GET | `/api/shipments/track/{trackingNumber}` | Get shipment by tracking number |
| PUT | `/api/shipments/{id}/status` | Update shipment status |

## Project Structure

```text
src/main/java/com/example/shipment
├── config
│   ├── CorsConfig.java
│   └── WebSocketConfig.java
└── shipment
    ├── Shipment.java
    ├── ShipmentController.java
    ├── ShipmentDTO.java
    ├── ShipmentRepository.java
    ├── ShipmentService.java
    └── ShipmentStatus.java
```

## Run the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Install Maven dependencies.
4. Run `ShipmentApplication.java`.

The project uses **H2 Database**, so no separate database installation is required.

## WebSocket

Endpoint:

```text
/ws
```

Topics:

```text
/topic/shipments
/topic/shipments/{id}
```

## Author

**Mohamed Ashraf**

Java Backend Developer
