package com.landingpage.langinnails.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.landingpage.entries.DatosTurno;
import com.landingpage.entries.Propiedades;
import com.landingpage.ser.EmailSer;


@Controller
@RequestMapping
public class Controlador {

    private Propiedades propiedades;

    @Autowired
    private EmailSer emailService;

    @GetMapping("/")
    public String Comienzo(Model model)
    {
        propiedades = new Propiedades();
        model.addAttribute("titulo", propiedades.getTitulo());
        model.addAllAttributes(propiedades.getArticulos());
        model.addAttribute("secciones",propiedades.getSecciones());
        model.addAttribute("turno",new DatosTurno());
        return "index";
    }

    @PostMapping("/")
    public String procesarFormulario(@ModelAttribute DatosTurno turno, Model model) {
        String mensaje = "Hola Day soy tu Bot de turnos!🤖 \n  Tenes un turno para: "+ turno.getNombre()+" \n su usuario es: "+ turno.getNombre_user()+"\n se realiza un: "+ turno.getSer();
        emailService.sendSimpleEmail(turno.getDestinatario(), "Turno", mensaje);
        return Comienzo(model);
    }

}
