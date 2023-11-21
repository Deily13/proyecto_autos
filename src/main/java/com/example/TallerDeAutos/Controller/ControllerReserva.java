package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IReservaService;
import com.example.TallerDeAutos.model.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/reserva")
public class ControllerReserva {
    @Autowired
    private IReservaService reservaService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Reservas> reservas = reservaService.listar();
        model.addAttribute("reservas", reservas);
        return "index";
    }

    @PostMapping("/save")
    public String save(@Validated Reservas r){
        reservaService.save(r);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("reservas", new Reservas());
        return "vista_1";
    }
}
