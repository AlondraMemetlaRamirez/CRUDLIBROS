package com.mx.PrimerProyecto.service;

import java.util.List;

import com.mx.PrimerProyecto.entidad.Libro;
import com.mx.PrimerProyecto.respuesta.Respuesta;


public interface Metodos {
    public Respuesta guardar(Libro libro);
    public Respuesta editar(Libro libro);
    public Respuesta eliminar(int isbn);
    public Respuesta buscar(int isbn);
    public Respuesta mostrar();
}
