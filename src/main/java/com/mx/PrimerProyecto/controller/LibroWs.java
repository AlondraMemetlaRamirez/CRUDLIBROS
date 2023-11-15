package com.mx.PrimerProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PrimerProyecto.entidad.Libro;
import com.mx.PrimerProyecto.respuesta.Respuesta;
import com.mx.PrimerProyecto.service.Implementacion;

@RestController
@RequestMapping("libros")
@CrossOrigin
public class LibroWs {
	@Autowired
	Implementacion imp;
	
	// mostrar
	@GetMapping("mostrar")
	public Respuesta mostrar(){
		return imp.mostrar();
		
	}
	// guardar
	@PostMapping("guardar")
	public Respuesta guardar(@RequestBody Libro libro) {
		return imp.guardar(libro);
	}
	
	// editar
	@PostMapping("editar")
	public Respuesta editar(@RequestBody Libro libro) {
		return imp.editar(libro);
		}
	// eliminar
	@PostMapping("eliminar")
	public Respuesta eliminar(@RequestBody int isbn) {
		return imp.eliminar(isbn);
	}
	//buscar
	@PostMapping("buscar")
	public Respuesta buscar(@RequestBody int isbn) {
	 return	imp.buscar(isbn);
	}
}