
package com.usdApp.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/operaciones")
public class OperacionesController {
    
    @PostMapping("/operaciones")
    public String operacionesAll(){
        return "userOperacionesAll";
    }

    @PostMapping("/operacionesUser/compra")
    public String compra() {
        return "compra-form";
    }

    @PostMapping("/operacionesUser/venta")
    public String venta() {
        return "venta-form";
    }
    
    @PostMapping("/operacionesUser/prestamos")
    public String prestamos() {
        return "prestamos-form";
    }

}
