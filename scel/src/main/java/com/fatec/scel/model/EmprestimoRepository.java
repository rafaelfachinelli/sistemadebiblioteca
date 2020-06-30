package com.fatec.scel.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends CrudRepository<Emprestimo, Long> {

}