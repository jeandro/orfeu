package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.gtasistemas.orfeu.model.Profissoes;


public interface ProfissoesRepository extends JpaRepository<Profissoes, Long> {
	
	@Query(value = "select * from profissoes p where p.profissoes_profissao like ?1% ORDER BY p.profissoes_profissao", nativeQuery = true)
	List<Profissoes> findallByProfissoes(final String p0);
}
