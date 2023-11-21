package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IMarcaService;
import com.example.TallerDeAutos.model.Marcas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/marca")
public class ControllerMarca {
    @Autowired
    private IMarcaService marcaService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Marcas> marcas = marcaService.listar();
        model.addAttribute("marcas", marcas);
        return "index";
    }

    @PostMapping("/save")
    public String save(@Validated Marcas m){
        marcaService.save(m);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("marcas", new Marcas());
        return "vista_1";
    }
}
