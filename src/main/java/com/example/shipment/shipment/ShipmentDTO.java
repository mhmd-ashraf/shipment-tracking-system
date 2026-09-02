package com.example.shipment.shipment;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;


public class ShipmentDTO {
    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateShipmentRequest {
        @NotBlank(message = "Origin is required")
        public String origin;
        public String estimatedDelivery;

        @NotBlank(message = "Desination is required")
        public String destination;


    }

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ShipmentResponse {
        private Long id;
        private String trackingNumber;
        private String origin;
        private String destination;
        private ShipmentStatus status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String currentLocation;
        private String estimatedDelivery;

    }

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateStatusRequest {
        private ShipmentStatus status;
        private String currentLocation;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StatusMessageUpdate {
        private Long shipmentId;
        private String trackingNumber;
        private ShipmentStatus status;
        private String currentLocation;
        private LocalDateTime timpstamp;
        private String message;
    }
}
