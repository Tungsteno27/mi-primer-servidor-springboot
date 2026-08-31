package com.example.miPrimerServidorWeb;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class HomeController {

    @GetMapping("/hello")
    public String hola(){
        return "bienvenido a mi primer servidor";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola " + nombre + " bienvenido a mi servidor";
    }

    @PostMapping("/mensaje")
    public String mensaje(@RequestBody String texto){
        return "mensaje " + texto;
    }
}
