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
@NamedQuery(name="getProductListbyIdJPQL",query="select e from ProductEntity e where e.name=?1")
@NamedNativeQuery(name="getProductListbyIdSQL",
        query="select * from product_table e where e.product_name=?1",
        resultClass=ProductEntity.class)//doesn't work without this line .we get object[] and it needs explicit mention during autoscan itself

@NamedStoredProcedureQuery(name="storedProcPreDefinedQueryforGetbyName",
                           procedureName = "getProductInfoUsingNamedProcQuery",
                           parameters = { @StoredProcedureParameter(
                                   mode=ParameterMode.IN,
                                   name="Id",
                                   type=Integer.class
                           ),
                                   @StoredProcedureParameter(
                                           mode=ParameterMode.OUT,
                                           name="o_product_name",
                                           type=String.class
                                   )
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
