package com.example.TallerDeAutos.Controller;

import com.example.TallerDeAutos.interfaceService.IClienteService;
import com.example.TallerDeAutos.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
    @Controller
    public class ControllerCliente{

        @Autowired
        private IClienteService clienteService;

        @GetMapping("/listar")
        public String listar(Model model){
            List<Clientes> clientes = clienteService.listar();
            model.addAttribute("clientes", clientes);
            return "index";
        }

        @GetMapping("eliminar/{id}")
        public String delete(@PathVariable int id){
            clienteService.delete(id);
            return "redirect:/listar";
        }

        @PostMapping("/save")
        public String save(@Validated Clientes c){
            clienteService.save(c);
            return "redirect:/listar";
        }

        @GetMapping("/mostrarVista2")
        public String mostrarVista2(Model model){
            // Aquí podrías obtener el objeto cliente pasado desde la acción save y agregarlo al modelo
            // Luego, cargar Vista_2.html con los datos necesarios
            return "Vista_2";
        }

        @GetMapping("/nuevo")
        public String agregar(Model model){
            model.addAttribute("clientes", new Clientes());
            return "Vista_2";
        }
    }


