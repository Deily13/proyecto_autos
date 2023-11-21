package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IServicioService;
import com.example.TallerDeAutos.model.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/servicio")
public class ControllerServicios {
    @Autowired
    private IServicioService servicioService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Servicios> servicios = servicioService.listar();
        model.addAttribute("servicios", servicios);
        return "index";
    }

    @PostMapping("/save")
    public String save(@Validated Servicios s){
        servicioService.save(s);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("servicios", new Servicios());
        return "vista_1";
    }
}
