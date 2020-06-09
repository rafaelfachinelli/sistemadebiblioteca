package com.fatec.scel.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.LivroRepository;

@Controller
@RequestMapping(path = "/livros")
public class LivroController {
	Logger logger = LogManager.getLogger(LivroController.class);
	@Autowired
	private LivroRepository repository;

	@GetMapping("/consulta")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		modelAndView.addObject("livros", repository.findAll());
		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastraLivro(Livro livro) {
		ModelAndView mv = new ModelAndView("cadastrarLivro");
		mv.addObject("livro", livro);
		return mv;
	}

	@GetMapping("/edit/{isbn}")
	public ModelAndView mostraFormAdd(@PathVariable("isbn") String isbn) {
		ModelAndView modelAndView = new ModelAndView("atualizarLivro");
		modelAndView.addObject("livro", repository.findByIsbn(isbn));  
		return modelAndView;
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {

		repository.deleteById(id);
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		modelAndView.addObject("livros", repository.findAll());
		return modelAndView;
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid Livro livro, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		if (result.hasErrors()) {
			return new ModelAndView("cadastrarLivro");
		}
		try {
			Livro jaExiste = null;
			jaExiste = repository.findByIsbn(livro.getIsbn());
			if (jaExiste == null) {
				repository.save(livro);
				modelAndView = new ModelAndView("consultarLivro");
				modelAndView.addObject("livros", repository.findAll());
				return modelAndView;
			} else {
				return new ModelAndView("cadastrarLivro");
			}
		} catch (Exception e) {
			logger.info("erro ===> " + e.getMessage());
			return modelAndView;
		}
	}

	@PostMapping("/update/{id}")
	public ModelAndView atualiza(@PathVariable("id") Long id, @Valid Livro livro, BindingResult result) {
		if (result.hasErrors()) {
			livro.setId(id);
			return new ModelAndView("atualizarLivro");
		}
		Livro umLivro = repository.findById(id).get();
		umLivro.setAutor(livro.getAutor());
		umLivro.setIsbn(livro.getIsbn());
		umLivro.setTitulo(livro.getTitulo());
		repository.save(umLivro);
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		modelAndView.addObject("livros", repository.findAll());
		return modelAndView;
	}
}