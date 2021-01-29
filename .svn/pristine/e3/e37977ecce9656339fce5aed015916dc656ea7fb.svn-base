package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.gtasistemas.orfeu.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	@Query(value = "select * from Produtos p where p.prod_codigo = ?1", nativeQuery = true)
	Produtos findallByCodigo_barra(final String p0);

	@Query(value = "select * from Produtos p where p.prod_descricao like ?1% ORDER BY p.prod_descricao", nativeQuery = true)
	List<Produtos> findallByDescricao(final String p0);

}
