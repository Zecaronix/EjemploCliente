package com.sventas.sventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador principal para manejar las solicitudes a la página de inicio.
 * Utiliza la anotación @Controller de Spring para definir un controlador web.
 */
@Controller
public class HomeController {

  /**
   * Maneja las solicitudes GET a la raíz del sitio web ("/").
   *
   * @return El nombre de la vista "index", que será renderizada como index.html.
   */
  @GetMapping("/")
  public String home() {
    return "index"; // Redirige a una vista llamada index.html
  }
}