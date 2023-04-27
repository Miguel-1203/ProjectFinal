package com.example.ProjecFinal.Service;

import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.Model.Vehiculo;
import com.example.ProjecFinal.Repository.IVehiculo;
import com.example.ProjecFinal.RepositoryService.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehiculoService implements IVehiculoService {

  @Autowired
  private IVehiculo data;

  @Override
  public List<Vehiculo> listar(){return(List<Vehiculo>) data.findAll();}

  @Override
  public int save(Vehiculo v) {
    int res = 0;
    Vehiculo vehiculo = data.save(v);
    if(!vehiculo.equals(null)){
      res = 1;
    }
    return res;
  }

  @Override
  public void delete(Long id) {
    data.deleteById(id);
  }
}
