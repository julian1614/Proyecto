package com.corhuila.Backend.controller;

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

import com.corhuila.Backend.entity.Pedido;
import com.corhuila.Backend.service.PedidoService;

@RestController
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable int id) {
        return pedidoService.getPedidoById(id);
    }

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }

    @PutMapping("/{id}")
    public Pedido updatePedido(@PathVariable int id, @RequestBody Pedido pedido) {
        Pedido existingPedido = pedidoService.getPedidoById(id);
        if (existingPedido != null) {
            pedido.setId(id);
            return pedidoService.savePedido(pedido);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable int id) {
        pedidoService.deletePedido(id);
    }
}