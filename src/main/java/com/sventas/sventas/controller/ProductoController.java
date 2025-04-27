package com.sventas.sventas.controller;

import com.sventas.sventas.model.Producto;
import com.sventas.sventas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductoController {

  @Autowired
  private ProductoRepository productoRepository;

  @GetMapping("/productos")
  public String listarProductos(Model model) {
    List<Producto> productos = productoRepository.findAll();
    model.addAttribute("productos", productos);
    return "productos"; // Redirige a una vista llamada productos.html
  }
}