package com.fatec.scel.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.fatec.scel.model.Livro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
	// Define a URL que requisitada chama o método
	@GetMapping("/menu")
	public String home() {
		// Retorna a view que deve ser chamada, neste exemplo a pagina menu (html)
		return "menu";
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastraLivro(Livro livro) {
		ModelAndView mv = new ModelAndView("cadastrarLivro");
		mv.addObject("livro", livro);
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView adicionar(Livro livro) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String data = simpleDateFormat.format(new Date());
		System.out.println("ISBN digitado na interface ===>" + livro.getIsbn());
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		modelAndView.addObject("serverDate", data);
		modelAndView.addObject("message", livro.getIsbn());
		modelAndView.addObject("livros", carrega());
		return modelAndView;
	}

	public List<Livro> carrega() {
		List<Livro> livros = new ArrayList<Livro>();
		Livro livro = new Livro("1111", "engenharia de software", "pressman");
		livros.add(livro);
		livro = new Livro("2222", "programacao web", "silvan");
		livros.add(livro);
		livro = new Livro("2222", "java como programar", "deitel");
		livros.add(livro);
		return livros;
	}
}