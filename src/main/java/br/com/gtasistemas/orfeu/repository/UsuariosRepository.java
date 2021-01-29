package br.com.gtasistemas.orfeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.gtasistemas.orfeu.model.Usuarios;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	
	@Query(value = "select * from usuarios u where u.usu_usuario like ?1% ORDER BY u.usu_usuario", nativeQuery = true)
	List<Usuarios> findallByLogin(final String p0);
}
