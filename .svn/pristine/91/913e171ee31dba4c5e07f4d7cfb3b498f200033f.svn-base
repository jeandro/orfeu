package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.gtasistemas.orfeu.model.Grupos;

public interface GruposRepository extends JpaRepository <Grupos, Long> {
	
	@Query(value = "select * from Grupos g where g.grupo_nome like ?1% ORDER BY g.grupo_nome", nativeQuery = true)
	List<Grupos> findallByDescricao(final String p0);

}
