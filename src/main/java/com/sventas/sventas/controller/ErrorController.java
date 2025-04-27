package com.sventas.sventas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Global error handling controller for the application.
 * This class uses Spring's @ControllerAdvice to handle exceptions
 * and provide a unified error response.
 */
@ControllerAdvice
public class ErrorController {

  /**
   * Handles all exceptions that occur in the application.
   *
   * @param ex The exception that was thrown.
   * @param model The model object used to pass attributes to the view.
   * @return The name of the error view to be rendered.
   */
  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String handleException(Exception ex, Model model) {
    // Add the exception message to the model to display it in the error view.
    model.addAttribute("error", ex.getMessage());
    return "error"; // Return the name of the error view.
  }
}