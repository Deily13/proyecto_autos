package com.example.TallerDeAutos.Controller;


import com.example.TallerDeAutos.interfaceService.IVehiculoService;
import com.example.TallerDeAutos.model.Servicios;
import com.example.TallerDeAutos.model.Vehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

@Controller
public class ControllerVehiculo {
    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/listarV")
    public String listar(Model model){
        List<Vehiculos> vehiculos = vehiculoService.listar();
        model.addAttribute("vehicilos", vehiculos);
        return "index";
    }

    @PostMapping("/guardarVehiculo")
    public String save(@Validated Vehiculos v, RedirectAttributesModelMap redirectAttributes){
        vehiculoService.guardarVehiculo(v);
        redirectAttributes.addFlashAttribute("vehiculos", v);
        return "redirect:/mostrarVista2";
    }

    @GetMapping("/nuevoV")
    public String agregar(Model model){
        model.addAttribute("vehiculo", new Vehiculos());
        return "Vista_1";
    }
}

