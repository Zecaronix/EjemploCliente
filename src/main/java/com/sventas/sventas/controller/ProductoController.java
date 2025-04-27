package com.sventas.sventas.controller;

import com.sventas.sventas.model.Producto;
import com.sventas.sventas.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador para manejar las solicitudes relacionadas con los productos.
 * Utiliza la anotación @Controller de Spring para definir un controlador web.
 */
@Controller
public class ProductoController {

  /**
   * Repositorio de productos inyectado automáticamente por Spring.
   * Proporciona acceso a las operaciones CRUD para la entidad Producto.
   */
  @Autowired
  private ProductoRepository productoRepository;

  /**
   * Maneja las solicitudes GET a la ruta "/productos".
   * Recupera la lista de productos desde el repositorio y la agrega al modelo.
   *
   * @param model El modelo utilizado para pasar atributos a la vista.
   * @return El nombre de la vista "productos", que será renderizada como productos.html.
   */
  @GetMapping("/productos")
  public String listarProductos(Model model) {
    List<Producto> productos = productoRepository.findAll();
    model.addAttribute("productos", productos);
    return "productos"; // Redirige a una vista llamada productos.html
  }
}