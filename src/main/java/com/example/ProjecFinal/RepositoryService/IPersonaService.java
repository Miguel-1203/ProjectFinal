package com.example.ProjecFinal.RepositoryService;

import com.example.ProjecFinal.Model.Persona;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.ProjecFinal"})
public interface IPersonaService {

  public List<Persona>listar();

  public Optional<Persona>listarId(Long id);

  public int save (Persona p);

  public void delete(Long id);


}
