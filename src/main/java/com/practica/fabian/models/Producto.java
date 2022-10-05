package com.practica.fabian.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name ="productos")
public class Producto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(nullable = false,length = 100)
    private String nombre;
   @Column(nullable = false,length = 50)
    private String provedoor;
    @Column(nullable = false,length = 50)
    private String categoria;
   @Column(nullable = false)
    private int cantidad;
   @Column(nullable = false)
    private double precio_unit;
}
