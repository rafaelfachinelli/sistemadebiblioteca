package com.fatec.scel.model;

import javax.persistence.*; //fornece aos desenvolvedores java facilidades para gerenciar objetos java e o banco de dados relacional
import javax.validation.constraints.*;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min = 4, max = 4, message = "ISBN deve ter 4 caracteres")
	private String isbn;
	
	private String titulo;
	
	private String autor;

	public Livro() {
	}

	public Livro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
        this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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
	
	
}