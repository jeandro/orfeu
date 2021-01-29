package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gtasistemas.orfeu.model.Grupos;
import br.com.gtasistemas.orfeu.repository.GruposRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestControllerAdvice
@RequestMapping("/grupos")
@Api (value = "/grupos")
public class GruposResource {
	@Autowired
	private GruposRepository grupoRepository;
	
	@ApiOperation(value = "Busca todos os Grupos ")
	@GetMapping
	public List<Grupos> listar() {
		return grupoRepository.findAll();
	}
	
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Grupos> buscarPeloCodigo(@PathVariable Long codigo) {
		return grupoRepository.findById(codigo);

	}
	
	@ApiOperation(value = "Busca pela Descrição ")
    @GetMapping({ "descricao/{Descricao}" })
    public List<Grupos> Descricao(@PathVariable final String Descricao) {
        return (List<Grupos>)this.grupoRepository.findallByDescricao(Descricao);
    }

}

