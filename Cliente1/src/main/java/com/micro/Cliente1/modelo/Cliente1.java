package com.micro.Cliente1.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente1_data")
@Data
public class Cliente1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ESENCIAL para MySQL AUTO_INCREMENT
    private Long id; // ID debe ser Long o Integer para IDENTITY

    private String nombre;
}
