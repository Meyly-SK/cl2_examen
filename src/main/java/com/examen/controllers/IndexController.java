package com.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.examen.models.Personal;
import com.examen.services.PersonalService;

@Controller
@RequestMapping("/home")
public class IndexController {
	
	@Autowired
	private PersonalService personalService;
	
	@Value("${index.titulo.text}")
	private String title;
	
	@ModelAttribute("personales")
	public List<Personal> obtenerPersonales(){
		List<Personal> personales = personalService.getAllPersonal();
		
		return personales;
	}
	
	@GetMapping("/lista")
    public String index(@RequestParam(value = "codigo", required = false) Long codigo, Model model) {
        model.addAttribute("titulo", title);
        List<Personal> personales;

        if (codigo != null) {
            personales = personalService.getPersonalByAreaCodigo(codigo);
        } else {
            personales = personalService.getAllPersonal();
        }

        model.addAttribute("personales", personales);
        return "index";
    }
	
}
