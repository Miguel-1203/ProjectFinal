package com.example.ProjecFinal.Service;

import com.example.ProjecFinal.Model.Mecanico;
import com.example.ProjecFinal.Model.Persona;
import com.example.ProjecFinal.Repository.IMecanico;
import com.example.ProjecFinal.RepositoryService.IMecanicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MecanicoService implements IMecanicoService {

  @Autowired
  private IMecanico data;

  @Override
  public List<Mecanico> listarMecanico() {
    return (List<Mecanico>) data.findAll();
  }

  @Override
  public Optional<Mecanico> listarIdMecanico(Long id) {

    return data.findById(id);
  }

  @Override
  public int saveMecanico(Mecanico m) {
    int res = 0;
    Mecanico mecanico = data.save(m);
    if(!mecanico.equals(null)){
      res = 1;
    }
    return res;
  }

  @Override
  public void deleteMecanico(Long id) {
    data.deleteById(id);
  }
}
