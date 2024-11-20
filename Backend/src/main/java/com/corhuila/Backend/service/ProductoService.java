// Paquete que contiene la clase de servicio para la entidad Producto
package com.corhuila.Backend.service;

// Importaciones necesarias para trabajar con listas y la anotación de inyección de dependencias
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Importación de la entidad Producto y su repositorio correspondiente
import com.corhuila.Backend.entity.Producto;
import com.corhuila.Backend.repository.ProductoRepository;

// Anotación que indica que esta clase es un servicio en el contexto de Spring
@Service
public class ProductoService{
    // Inyección automática del repositorio de productos para acceder a sus métodos
    @Autowired // Inyectar a repository el cual maneja por debajo los métodos de JPARepository
    private ProductoRepository productoRepository;

    // Método para obtener todos los productos utilizando el método findAll del repositorio
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    // Método para obtener un producto específico por su ID utilizando el método findById del repositorio
    public Producto getProductoById(int id) {
        // El método orElse devuelve null si el producto no se encuentra
        return productoRepository.findById(id).orElse(null);
    }

    // Método para guardar o actualizar un producto en la base de datos utilizando el método save del repositorio
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para eliminar un producto por su ID utilizando el método deleteById del repositorio
    public void deleteProducto(int id) {
        productoRepository.deleteById(id);
    }
}
