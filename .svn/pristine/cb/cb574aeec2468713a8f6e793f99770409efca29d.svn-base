package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.gtasistemas.orfeu.model.Aliquotas;

public interface AliquotasRepository extends JpaRepositoryImplementation<Aliquotas, Long> {
	
	@Query(value = "select * from aliquotas a where a.aliq_descricao like ?1% ORDER BY a.aliq_descricao", nativeQuery = true)
	List<Aliquotas> findallByDescricao(final String p0);

}
