package br.com.gtasistemas.orfeu.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter @NoArgsConstructor

@Entity
@Table(name = "aliquotas")
public class Aliquotas implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long cp_aliquotas;
	private String aliq_descricao;
	private BigDecimal aliq_percentual;
	private String aliq_codigo;
	

	
	

}
