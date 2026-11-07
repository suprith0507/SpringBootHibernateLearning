package com.hibernate.learning.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table( name="ProductTable",
        schema="dbo",
        catalog = "",
        uniqueConstraints = {
                // @UniqueConstraint(name = "uk_product_name", columnNames = {"name"}),
                @UniqueConstraint(name="price_title_unique",columnNames={"ProductName,ProductPrice"})
        },
        indexes = {
                @Index(name="Id_unique_constraint",columnList = "Id")
        }
)
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name="ProductName") // inside DB it is called ProductName
    private String name;

    @Column(name="ProductPrice" , nullable = false,length = 200)
    private Double price;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;



}
