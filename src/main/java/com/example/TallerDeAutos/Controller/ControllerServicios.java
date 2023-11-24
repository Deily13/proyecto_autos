package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IServicioService;
import com.example.TallerDeAutos.model.Reservas;
import com.example.TallerDeAutos.model.Servicios;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

@Controller
public class ControllerServicios {

    @Autowired
    private IServicioService servicioService;

    @GetMapping("/listarS")
    public String listar(Model model) {
        List<Servicios> servicios = servicioService.listar();
        model.addAttribute("servicios", servicios);
        return "index";
    }

    @GetMapping("/nuevoS")
    public String mostrarVistaUno() {
        return "Vista_1";
    }

    @PostMapping("/guardarServicio")
    public String save(@Validated Servicios s, RedirectAttributesModelMap redirectAttributes){
        servicioService.guardarServicio(s);
        redirectAttributes.addFlashAttribute("servicios", s);
        return "redirect:/mostrarVista1";
    }

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        // Handle the error and return an appropriate response
        // (e.g., display an error page)
        return "error"; // Replace "error" with the name of your error page
    }
}


