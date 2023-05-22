package com.example.ProjecFinal.RepositoryService;

import com.example.ProjecFinal.Model.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.ProjecFinal"})
public interface IVehiculoService {


  public List<Vehiculo> listarcoche();
  public Optional<Vehiculo> listarIdcoche(Long id);
  public int savecoche (Vehiculo v);

  public void deletecoche (Long id);

}
