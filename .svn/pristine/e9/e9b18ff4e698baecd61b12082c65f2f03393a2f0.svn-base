package br.com.gtasistemas.orfeu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gtasistemas.orfeu.model.Produtos;
import br.com.gtasistemas.orfeu.repository.ProdutosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestControllerAdvice
@RequestMapping("/produtos")
@Api (value = "/produtos")
public class ProdutosResource {

	@Autowired
	private ProdutosRepository produtoRepository;

	@GetMapping
	@ApiOperation(value = "Busca todos os Produtos ")
	public List<Produtos> listar() {
		return produtoRepository.findAll();

	}
    
	@ApiOperation(value = "Busca pelo Codigo ")
	@GetMapping("codigo/{codigo}")
	public Optional<Produtos> buscarPeloCodigo(@PathVariable Long codigo) {
		return produtoRepository.findById(codigo);

	}

	@ApiOperation(value = "Busca pelo Codigo de Barra ")
    @GetMapping({ "codigo_barra/{Codigo_barra}" })
    public Produtos Codigo_barra(@PathVariable final String Codigo_barra) {
        return this.produtoRepository.findallByCodigo_barra(Codigo_barra);
    }
    
	@ApiOperation(value = "Busca pela Descrição ")
    @GetMapping({ "descricao/{Descricao}" })
    public List<Produtos> Descricao(@PathVariable final String Descricao) {
        return (List<Produtos>)this.produtoRepository.findallByDescricao(Descricao.toUpperCase());
    }
}
