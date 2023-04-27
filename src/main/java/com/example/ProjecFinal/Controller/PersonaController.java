package com.example.ProjecFinal.Controller;

import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.RepositoryService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class PersonaController {

  @Autowired
  private IPersonaService service;

  @GetMapping("/newReporte")
  public String listar(Model model){
    List<Persona> personas= service.listar();
    model.addAttribute("personas", personas);
    return "form";
  }

  @GetMapping("/new")
  public String agregar(Model model){
    model.addAttribute("persona", new Persona());
    return "form";
  }


  @PostMapping("/save")
  public String save(@Validated Persona p){
    service.save(p);
    return "redirect:/reporte";
  }

  @GetMapping("/editar/{id}")
  public String editar(@PathVariable Long id, Model model){
    Optional<Persona> persona = service.listarId(id);
    model.addAttribute("persona", persona);
    return "form";
  }

  @GetMapping("/eliminar/{id}")
  public String delete(@PathVariable Long id){
    service.delete(id);
    return "redirect:/reporte";
  }


}
