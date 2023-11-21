package com.example.TallerDeAutos.Controller;


import com.example.TallerDeAutos.interfaceService.IVehiculoService;
import com.example.TallerDeAutos.model.Vehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/vehiculo")
public class ControllerVehiculo {
    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Vehiculos> vehiculos = vehiculoService.listar();
        model.addAttribute("vehicilos", vehiculos);
        return "index";
    }

    @PostMapping("/save")
    public String save(@Validated Vehiculos v){
        vehiculoService.save(v);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("vehiculo", new Vehiculos());
        return "vista_1";
    }
}

