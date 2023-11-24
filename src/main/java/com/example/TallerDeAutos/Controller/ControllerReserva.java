package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IReservaService;
import com.example.TallerDeAutos.model.Marcas;
import com.example.TallerDeAutos.model.Reservas;
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
public class ControllerReserva {
    @Autowired
    private IReservaService reservaService;

    @GetMapping("/listarR")
    public String listar(Model model){
        List<Reservas> reservas = reservaService.listar();
        model.addAttribute("reservas", reservas);
        return "index";
    }

    @PostMapping("/guardarReserva")
    public String guardarReserva(@Validated Reservas r, RedirectAttributesModelMap redirectAttributes){
        reservaService.guardarReserva(r);
        redirectAttributes.addFlashAttribute("reservas", r);
        return "redirect:/mostrarVista4";
    }

    @GetMapping("/nuevoR")
    public String agregar(Model model){
        model.addAttribute("reservas", new Reservas());
        return "Vista_1";
    }
}
