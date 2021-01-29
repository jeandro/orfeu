package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.gtasistemas.orfeu.model.Cidades;

public interface CidadesRepository extends JpaRepository<Cidades, Long> {
	
	@Query(value = "select * from cidades c where c.cid_cidade like ?1% ORDER BY c.cid_cidade", nativeQuery = true)
	List<Cidades> findallByCidade(final String p0);
	
}
