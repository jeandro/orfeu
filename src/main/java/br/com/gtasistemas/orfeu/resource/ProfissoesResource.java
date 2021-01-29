package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import br.com.gtasistemas.orfeu.model.Profissoes;
import br.com.gtasistemas.orfeu.repository.ProfissoesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestControllerAdvice
@RequestMapping("/profissoes")
@Api (value = "/profissoes")

public class ProfissoesResource {
	
	@Autowired
	private ProfissoesRepository profissoesRepository;
	
	@ApiOperation(value = "Busca todas Profissoes ")
	@GetMapping
	public List<Profissoes> listar() {
		return profissoesRepository.findAll();
	}
	
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Profissoes> buscarPeloCodigo(@PathVariable Long codigo) {
		return profissoesRepository.findById(codigo);

	}
	
	@ApiOperation(value = "Busca pela Profissao ")
    @GetMapping({ "profissao/{Profissao}" })
    public List<Profissoes> Profissao(@PathVariable final String Profissao) {
        return (List<Profissoes>)this.profissoesRepository.findallByProfissoes(Profissao);
    }

}
