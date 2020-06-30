package com.fatec.scel.servico;

import com.fatec.scel.model.Emprestimo;

public interface EmprestimoServico {
	public Iterable<Emprestimo> findAll();

	public String registraEmprestimo(Emprestimo emprestimo);

	public String registraDevolucao(String isbn); // supoe que isbn refere-se ao tombo

	public void deleteById(Long id);
}
