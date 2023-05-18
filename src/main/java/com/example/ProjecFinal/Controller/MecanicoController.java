package com.example.ProjecFinal.Controller;

import com.example.ProjecFinal.Model.Mecanico;
import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.RepositoryService.IMecanicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class MecanicoController {


  @Autowired
  private IMecanicoService service;

  @GetMapping("/vistageneralMecanico")
  public String listarMecanico(Model model){
    List<Mecanico> mecanicos= service.listarMecanico();
    model.addAttribute("mecanicos", mecanicos);
    return "general2";
  }

  /*
  @GetMapping("/newmecanico")
  public String agregarMecanico(Model model){
    model.addAttribute("persona", new Mecanico());
    return "diagnos";
  }




  @PostMapping("/savemecanico")
  public String saveMecanico(@Validated Mecanico m){
    service.saveMecanico(m);
    return "diagnos";
  }*/


}
