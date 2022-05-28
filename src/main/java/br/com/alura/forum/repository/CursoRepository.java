package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

public interface CursoRepository extends JpaRepository<Topico, Long> {

  Curso findByNome(String nome);
  
}
