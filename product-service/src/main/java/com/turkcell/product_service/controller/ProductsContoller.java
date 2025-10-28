package com.turkcell.product_service.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductsContoller {

  @GetMapping
  public String sayHello() {
    return "hello from products controller";
  }

  @GetMapping("/{id}")
  public String sayHello(@PathVariable int id) {
    return "hello from products controller" + id;
  }

  @PostMapping
  public String createProduct() {

    return "createproduct";
  }

  @PutMapping
  public String updateProduct() {
    return "update ";
  }

  @DeleteMapping
  public String deleteProduct() {
    return "delete ";
  }
}
