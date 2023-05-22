package com.example.ProjecFinal.Controller;

import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.Model.Vehiculo;
import com.example.ProjecFinal.RepositoryService.IVehiculoService;
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
public class VehiculoController {

  @Autowired
  private IVehiculoService service;

  @GetMapping("/listarcoche")
  public String listar(Model model){
    List<Vehiculo> vehiculos= service.listarcoche();
    model.addAttribute("vehiculos", vehiculos);
    return "tablacoches";
  }

  @PostMapping("/savecoche")
  public String save(@Validated Vehiculo v){
    service.savecoche(v);
    return "redirect:/listarcoche" ;
  }

  @GetMapping("/newcoche")
  public String agregar(Model model){
    model.addAttribute("vehiculo", new Vehiculo());
    return "diagnos";
  }

  @GetMapping("/editarcoche/{id}")
  public String editar(@PathVariable Long id, Model model){
    Optional<Vehiculo> vehiculo = service.listarIdcoche(id);
    model.addAttribute("vehiculo", vehiculo);
    return "diagnos";
  }

  @GetMapping("/eliminarcoche/{id}")
  public String delete(@PathVariable Long id){
    service.deletecoche(id);
    return "redirect:/listarcoche";
  }




}
