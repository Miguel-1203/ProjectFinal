package com.example.ProjecFinal.RepositoryService;

import com.example.ProjecFinal.Model.Mecanico;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.ProjecFinal"})
public interface IMecanicoService {

  public List<Mecanico> listarMecanico();

  public Optional<Mecanico> listarIdMecanico(Long id);

  public int saveMecanico (Mecanico m);

  public void deleteMecanico(Long id);
}
