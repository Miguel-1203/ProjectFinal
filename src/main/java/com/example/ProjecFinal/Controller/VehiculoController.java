package com.example.ProjecFinal.Controller;

import com.example.ProjecFinal.Model.Vehiculo;
import com.example.ProjecFinal.Repository.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class VehiculoController {

  @Autowired
  IVehiculo service;

  @PostMapping("/savecoche")
  public String save(@Validated Vehiculo v){
    service.save(v);
    return "tabla" ;
  }

  @GetMapping("/newcoche")
  public String agregar(Model model){
    model.addAttribute("vehiculo", new Vehiculo());
    return "diagnos";
  }




}
