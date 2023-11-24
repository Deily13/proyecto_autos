package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IMarcaService;
import com.example.TallerDeAutos.model.Clientes;
import com.example.TallerDeAutos.model.Marcas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;


import java.util.List;
@Controller
public class ControllerMarca {
    @Autowired
    private IMarcaService marcaService;

    @GetMapping("/listarM")
    public String listar(Model model){
        List<Marcas> marcas = marcaService.listar();
        model.addAttribute("marcas", marcas);
        return "index";
    }

    @PostMapping("/guardarMarca")
    public String guardarMarca(@Validated Marcas m, RedirectAttributesModelMap redirectAttributes){
        marcaService.guardarMarca(m);
        redirectAttributes.addFlashAttribute("marcas", m);
        return "redirect:/mostrarVista2";
    }

}
