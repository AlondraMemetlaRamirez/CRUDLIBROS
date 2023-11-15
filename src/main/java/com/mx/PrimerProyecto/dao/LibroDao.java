package com.mx.PrimerProyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.PrimerProyecto.entidad.Libro;

@Repository
public interface LibroDao extends JpaRepository<Libro,Integer> {

}
