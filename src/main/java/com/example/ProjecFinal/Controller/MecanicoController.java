package com.example.ProjecFinal.Controller;

import com.example.ProjecFinal.Model.Mecanico;
import com.example.ProjecFinal.RepositoryService.IMecanicoService;
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
@RequestMapping()
public class MecanicoController {

  @Autowired
  private IMecanicoService service;

  @GetMapping("/listarmecanico")
  public String listar(Model model){
    List<Mecanico> Mecanicos= service.listarMecanico();
    model.addAttribute("Mecanicos", Mecanicos);
    return "tablamecanico";
  }

  @PostMapping("/savemecanico")
  public String save(@Validated Mecanico m){
    service.saveMecanico(m);
    return "redirect:/listarmecanico" ;
  }

  @GetMapping("/newmecanico")
  public String agregar(Model model){
    model.addAttribute("Mecanico", new Mecanico());
    return "crearmecanico";
  }

  @GetMapping("/editarmecanico/{id}")
  public String editar(@PathVariable Long id, Model model){
    Optional<Mecanico> Mecanico = service.listarIdMecanico(id);
    model.addAttribute("Mecanico", Mecanico);
    return "crearmecanico";
  }

  @GetMapping("/eliminarmecanico/{id}")
  public String delete(@PathVariable Long id){
    service.deleteMecanico(id);
    return "redirect:/listarmecanico";
  }
}
