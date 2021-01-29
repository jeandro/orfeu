package br.com.gtasistemas.orfeu.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter @NoArgsConstructor

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long cp_usuario;
    private String usu_usuario_responsavel;
    private String usu_usuario;
    private String usu_senha;
    // usu_foto
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date usu_hora_reg;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date usu_data_ult_mod;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date usu_hora_ult_mod;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date usu_data_reg;
    private String usu_cargo;
    // usu_direitos
    //usu_direitos_txt
    private String usu_cor_grid1;
    private String usu_cor_grid2;
    private String usu_cor_grid3;
    private String usu_cor_negrito;
    

	

}
