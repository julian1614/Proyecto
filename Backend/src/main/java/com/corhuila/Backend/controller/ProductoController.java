// Paquete que contiene la clase del controlador de productos
package com.corhuila.Backend.controller;

// Importaciones necesarias para trabajar con listas y anotaciones de Spring
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Importaciones de las entidades y servicios de la aplicación
import com.corhuila.Backend.entity.Producto;
import com.corhuila.Backend.service.ProductoService;

// Anotación que define la clase como un controlador REST
@RestController
// Define la ruta base para todos los métodos del controlador
@RequestMapping("/producto") // Mapea todas las rutas que comiencen con este endpoint
@CrossOrigin // Permite que el controlador maneje solicitudes CORS tanto local como remotamente
public class ProductoController {
    // Inyecta automáticamente una instancia de ProductoService
    @Autowired // Inyectamos el servicio que contiene los métodos
    private ProductoService productoService;

    // Maneja las solicitudes GET para obtener todos los productos
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    // Maneja las solicitudes GET para obtener un producto por su ID
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable int id) {
        return productoService.getProductoById(id);
    }

    // Maneja las solicitudes POST para crear un nuevo producto
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    // Maneja las solicitudes PUT para actualizar un producto existente por su ID
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable int id, @RequestBody Producto producto) {
        Producto existingProducto = productoService.getProductoById(id);
        if (existingProducto != null) {
            producto.setId(id);
            return productoService.saveProducto(producto);
        }
        return null;
    }

    // Maneja las solicitudes DELETE para eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable int id) {
        productoService.deleteProducto(id);
    }
}
