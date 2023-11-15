package com.mx.PrimerProyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.PrimerProyecto.dao.LibroDao;
import com.mx.PrimerProyecto.entidad.Libro;
import com.mx.PrimerProyecto.respuesta.Respuesta;

@Service
public class Implementacion implements Metodos {

	@Autowired
	LibroDao dao;

	@Override
	public Respuesta guardar(Libro libro) {
		if (dao.findAll().isEmpty()) {
			dao.save(libro);
			return new Respuesta("El libro se ingresó exitosamente", libro, true);
		} else {
			for (Libro l : dao.findAll()) {
				if (l.getIsbn() == libro.getIsbn()) {
					return new Respuesta("El libro ya existe", null, false);
				}
			}
			dao.save(libro);
			return new Respuesta("El libro se ingresó exitosamente", libro, true);
		}

	}

	@Override
	public Respuesta editar(Libro libro) {
		if (dao.existsById(libro.getIsbn())) {
			dao.save(libro);
			return new Respuesta("El libro fue editado exitosaente", libro, true);
		} else {
			return new Respuesta("No existe ese libro", libro, false);
		}
	}

	@Override
	public Respuesta eliminar(int isbn) {
		if (dao.existsById(isbn)) {
			dao.deleteById(isbn);
			return new Respuesta("El libro fue eliminado exitosamente", isbn, true);
		} else {
			return new Respuesta("No existe ese libro", isbn, false);
		}

	}
	@Override
	public Respuesta buscar(int isbn) {
		Libro libro = dao.findById(isbn).orElse(null);
		if(dao.existsById(isbn)) {
			return new Respuesta("Se busco este libro: ",(libro),true);
		}
		else {
			return new Respuesta("Este libro no existe", isbn, false);
		}
	}

	 @Override
		public Respuesta mostrar() {
			return new Respuesta ("Se muestran todos los libros", dao.findAll(),true);
		}
}
