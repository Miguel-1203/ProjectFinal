package com.example.ProjecFinal.Service;

import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.Model.Vehiculo;
import com.example.ProjecFinal.Repository.IVehiculo;
import com.example.ProjecFinal.RepositoryService.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService implements IVehiculoService {

  @Autowired
  private IVehiculo data;

  @Override
  public List<Vehiculo> listarcoche() {
    return (List<Vehiculo>) data.findAll();
  }

  @Override
  public Optional<Vehiculo> listarIdcoche(Long id) {

    return data.findById(id);
  }

  @Override
  public int savecoche(Vehiculo v) {
    int res = 0;
    Vehiculo vehiculo = data.save(v);
    if(!vehiculo.equals(null)){
      res = 1;
    }
    return res;
  }

  @Override
  public void deletecoche(Long id){data.deleteAllById(Collections.singleton(id));}

}
