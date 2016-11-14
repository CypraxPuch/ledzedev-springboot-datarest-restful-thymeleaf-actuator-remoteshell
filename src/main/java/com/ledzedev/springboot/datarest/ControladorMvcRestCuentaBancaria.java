package com.ledzedev.springboot.datarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 14/Nov/2016.
 */
@Controller
public class ControladorMvcRestCuentaBancaria {

    @Autowired
    private RepositorioCuentas repositorioCuentas;

    @RequestMapping("/cuentasBancarias.aspx")
    String estadoDeCuenta(Model model){

        model.addAttribute("cuentas", this.repositorioCuentas.findAll());

        return "estadoDeCuenta";
    }

}
