package com.example.ProjecFinal.Repository;

import com.example.ProjecFinal.Model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVehiculo extends CrudRepository<Vehiculo,Long> {

}
