package com.mx.PrimerProyecto.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
*create table libros(
 isbn number primary key,
 titulo NVARCHAR2(50),
 autor NVARCHAR2(50),
 editorial NVARCHAR2(50),
 genero NVARCHAR2(50),
 num_pag number,
 precio number
 );
* */
@Entity
@Table(name = "libros")
public class Libro {
	@Id
	@Column(name = "isbn")
	int isbn;
	@Column(name = "titulo")
	String titulo;
	@Column(name = "autor")
	String autor;
	@Column(name = "editorial")
	String editorial;
	@Column(name = "genero")
	String genero;
	@Column(name = "num_pag")
	int numPag;
	@Column(name = "precio")
	double precio;

	public Libro() {
	}

	public Libro(int isbn, String titulo, String autor, String editorial, String genero, int numPag, double precio) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.numPag = numPag;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", genero=" + genero + ", numPag=" + numPag + ", precio=" + precio + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}