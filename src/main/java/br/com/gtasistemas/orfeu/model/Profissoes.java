package br.com.gtasistemas.orfeu.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter @NoArgsConstructor

@Entity
@Table(name = "profissoes")
public class Profissoes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long cp_profissoes;
    private String profissoes_profissao;
    private String usu_usuario;
    //profissoes_obs
    @ManyToOne
    @JoinColumn(name = "cs_usuario", nullable = false)
    private Usuarios usarioprofissoes;

}
