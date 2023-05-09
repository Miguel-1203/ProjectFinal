package com.example.ProjecFinal.RepositoryService;

import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.Model.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.example.ProjecFinal"})
public interface IVehiculoService {


  public List<Vehiculo> listarcoche();
  public int savecoche (Vehiculo v);

  public void delete (Long id);

}
