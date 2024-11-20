// Paquete que contiene la interfaz del repositorio de productos
package com.corhuila.Backend.repository;

// Importaciones de Spring Framework para trabajar con el repositorio JPA
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Importación de la entidad Producto
import com.corhuila.Backend.entity.Producto;

// Anotación que indica que la interfaz es un repositorio de Spring, un mecanismo para encapsular almacenamiento,
// recuperación y comportamiento de búsqueda que emula una colección de objetos
@Repository
// Definición de la interfaz ProductoRepository que extiende JpaRepository,
// proporcionando métodos CRUD para la entidad Producto y su clave primaria de tipo Integer
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    // No es necesario definir métodos adicionales, JpaRepository proporciona todos los métodos CRUD básicos
}
