package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IServicioCService;
import com.example.TallerDeAutos.model.Servicios;
import com.example.TallerDeAutos.model.ServiciosC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/serviciosC")
public class ControllerServiciosC {
    @Autowired
    private IServicioCService iServicioCService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<ServiciosC> serviciosCS = iServicioCService.listar();
        model.addAttribute("serviciosC", serviciosCS);
        return "index";
    }


    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("servicios", new Servicios());
        return "vista_1";
    }
}
