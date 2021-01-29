package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import br.com.gtasistemas.orfeu.model.Usuarios;
import br.com.gtasistemas.orfeu.repository.UsuariosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestControllerAdvice
@RequestMapping("/usuarios")
@Api (value = "/usuarios")
public class UsuariosResource {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@ApiOperation(value = "Busca todos Usuarios ")
	@GetMapping
	public List<Usuarios> listar() {
		return usuariosRepository.findAll();
	}
	
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Usuarios> buscarPeloCodigo(@PathVariable Long codigo) {
		return usuariosRepository.findById(codigo);

	}
	
	@ApiOperation(value = "Busca pela Login ")
    @GetMapping({ "login/{Login}" })
    public List<Usuarios> Login(@PathVariable final String Login) {
        return (List<Usuarios>)this.usuariosRepository.findallByLogin(Login);
    }

}
