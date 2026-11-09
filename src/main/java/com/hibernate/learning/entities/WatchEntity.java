package com.hibernate.learning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
    @Table(name = "watches",
          uniqueConstraints={
            @UniqueConstraint(name="referenceNumberconstraint",columnNames = "referenceNumber")
          })
    public class WatchEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // Basic Details
        private String brand;
        private String model;
        private String collection;
        private String referenceNumber;

        // Pricing
        private BigDecimal price;
        private String currency;
        private BigDecimal discountPercentage;

        // Physical Properties
        private Double caseDiameter;      // mm
        private Double caseThickness;     // mm
        private Double lugWidth;          // mm
        private Double weight;            // grams

        // Materials
        private String caseMaterial;
        private String bezelMaterial;
        private String strapMaterial;
        private String crystalMaterial;

        // Movement
        private String movementType;      // Automatic, Quartz, Manual
        private String caliber;
        private Integer powerReserve;     // Hours

        // Dial
        private String dialColor;
        private String dialType;

        // Water Resistance
        private Integer waterResistance;  // meters


        @CreationTimestamp
        private LocalDateTime createdDate;

        @UpdateTimestamp
        private LocalDateTime updatedDate;
    }

