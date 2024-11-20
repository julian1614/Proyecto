// Paquete que contiene la interfaz del repositorio de pedidos
package com.corhuila.Backend.repository;

// Importaciones de Spring Framework para trabajar con el repositorio JPA
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Importación de la entidad Pedido
import com.corhuila.Backend.entity.Pedido;

// Anotación que indica que la interfaz es un repositorio de Spring
@Repository
// Definición de la interfaz PedidoRepository que extiende JpaRepository,
// proporcionando métodos CRUD para la entidad Pedido y su clave primaria de tipo Integer
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    // No es necesario definir métodos adicionales, JpaRepository proporciona todos los métodos CRUD básicos
}

