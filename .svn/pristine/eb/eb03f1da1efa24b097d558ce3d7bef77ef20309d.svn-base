package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gtasistemas.orfeu.model.Cidades;
import br.com.gtasistemas.orfeu.repository.CidadesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestControllerAdvice
@RequestMapping("/cidades")
@Api (value = "/cidades")
public class CidadesResource {
	
	@Autowired
	private CidadesRepository cidadesRepository;
	
	@ApiOperation(value = "Busca todas as Cidades ")
	@GetMapping
	public List<Cidades> listar() {
		return cidadesRepository.findAll();
	}
	
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Cidades> buscarPeloCodigo(@PathVariable Long codigo) {
		return cidadesRepository.findById(codigo);

	}

	@ApiOperation(value = "Busca pela Cidade ")
    @GetMapping({ "cidade/{Cidade}" })
    public List<Cidades> Cidade(@PathVariable final String Cidade) {
        return (List<Cidades>)this.cidadesRepository.findallByCidade(Cidade);
    }
}
