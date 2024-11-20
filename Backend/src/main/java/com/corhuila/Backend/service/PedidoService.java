// Paquete que contiene la clase de servicio para la entidad Pedido
package com.corhuila.Backend.service;

// Importaciones necesarias para trabajar con listas y la anotación de inyección de dependencias
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Importación de la entidad Pedido y su repositorio correspondiente
import com.corhuila.Backend.entity.Pedido;
import com.corhuila.Backend.repository.PedidoRepository;

// Anotación que indica que esta clase es un servicio en el contexto de Spring
@Service
public class PedidoService {
    // Inyección automática del repositorio de pedidos para acceder a sus métodos
    @Autowired
    private PedidoRepository pedidoRepository;

    // Método para obtener todos los pedidos utilizando el método findAll del repositorio
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    // Método para obtener un pedido específico por su ID utilizando el método findById del repositorio
    public Pedido getPedidoById(int id) {
        // El método orElse devuelve null si el pedido no se encuentra
        return pedidoRepository.findById(id).orElse(null);
    }

    // Método para guardar o actualizar un pedido en la base de datos utilizando el método save del repositorio
    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Método para eliminar un pedido por su ID utilizando el método deleteById del repositorio
    public void deletePedido(int id) {
        pedidoRepository.deleteById(id);
    }
}
