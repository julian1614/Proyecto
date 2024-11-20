// Paquete que contiene la clase de entidad Producto
        package com.corhuila.Backend.entity;

// Importaciones de Jakarta Persistence para anotaciones de mapeo de entidades
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Anotación que indica que esta clase es una entidad JPA
@Entity
// Anotación que especifica la tabla de base de datos asociada con esta entidad
@Table(name = "productos")
public class Producto {
    // Anotación que indica que el campo es la clave primaria de la entidad
    @Id
    // Anotación que especifica la estrategia de generación de valores para la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Identificador único del producto
    private String nombre; // Nombre del producto
    private double precio; // Precio del producto

    private String direccion;

    // Métodos getter y setter para acceder y modificar las propiedades de la entidad
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
