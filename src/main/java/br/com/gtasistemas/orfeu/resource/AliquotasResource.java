package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gtasistemas.orfeu.model.Aliquotas;
import br.com.gtasistemas.orfeu.repository.AliquotasRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestControllerAdvice
@RequestMapping("/aliquotas")
@Api (value = "/aliquotas")
public class AliquotasResource {

	@Autowired
	private AliquotasRepository aliquotaRepository;

	@ApiOperation(value = "Busca todas Aliquotas ")
	@GetMapping
	public List<Aliquotas> listar() {
		return aliquotaRepository.findAll();
	}
	
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Aliquotas> buscarPeloCodigo(@PathVariable Long codigo) {
		return aliquotaRepository.findById(codigo);

	}
	
	@ApiOperation(value = "Busca pela Descrição ")
    @GetMapping({ "descricao/{Descricao}" })
    public List<Aliquotas> Descricao(@PathVariable final String Descricao) {
        return (List<Aliquotas>)this.aliquotaRepository.findallByDescricao(Descricao);
    }

}
