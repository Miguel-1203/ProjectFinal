package com.example.ProjecFinal.Controller;

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

@Controller
@RequestMapping
public class VehiculoController {

  @Autowired
  private IVehiculoService serviceVehiculo;


  @GetMapping("/vistageneralCoche")
  public String listarcoche(Model model){
    List<Vehiculo> vehiculo= serviceVehiculo.listarcoche();
    model.addAttribute("vehiculos", vehiculo);
    return "general1";
  }



  @PostMapping("/savecoche")
  public String savecoche(@Validated Vehiculo v){
    serviceVehiculo.savecoche(v);
    return "diagnos" ;
  }

  @GetMapping("/newcoche")
  public String agregarcoche(Model model){
    model.addAttribute("vehiculo", new Vehiculo());
    return "diagnos";
  }

  @GetMapping("/eliminar/{id}")
  public String deletecoche(@PathVariable Long id){
    serviceVehiculo.deletecoche(id);
    return "redirect:/vistageneralCoche";
  }




}
