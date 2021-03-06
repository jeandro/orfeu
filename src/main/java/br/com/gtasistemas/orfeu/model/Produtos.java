package br.com.gtasistemas.orfeu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Produtos")
public class Produtos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long cp_produtos;
	 @ManyToOne
	    @JoinColumn(name = "cs_aliquotas", nullable = false)
	    private Aliquotas aliquotaproduto;
     @ManyToOne
        @JoinColumn(name = "cs_grupos", nullable = false)
        private Grupos grupoproduto;
	private String prod_codigo;
	private String prod_descricao;
	private String prod_desc_resumida;
	private String prod_unid_pct;
	private BigDecimal prod_qtde_pct;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date prod_dt_cadastro;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date prod_dt_alteracao;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date prod_hora_cadastro;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date prod_hora_alteracao;
	private BigDecimal prod_preco_custo;
	private BigDecimal prod_preco_venda;
	private BigDecimal prod_preco_promocao;
	private BigDecimal prod_porcentagem_lucro;
	private BigDecimal prod_porcentagem_retencao;
	private String prod_em_promocao;
	private BigDecimal prod_estoque_max;
	private BigDecimal prod_estoque_min;
	private BigDecimal prod_peso_bruto;
	private BigDecimal prod_peso_liquido;
	private String prod_embalagem;
	@Temporal(javax.persistence.TemporalType.DATE)
    private Date prod_data_ult_alteracao;
    private BigDecimal prod_ult_preco;
    private String  prod_prog_alt_custo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date prod_data_ult_alt_venda;
    private BigDecimal prod_ult_preco_venda;
    private String prod_prog_alt_venda;
    private String prod_resp_alt_venda;
    private BigDecimal prod_comissao;
    private String prod_pesavel;
    private String prod_morto;
    private BigDecimal prod_pis_cofins;
    @Column(columnDefinition = "TEXT")
    private String prod_obs1;
    private String prod_lucratividade;
    private BigDecimal prod_pis_cofins_saida;
    private BigDecimal prod_preco_venda_atacado;
    private Integer prod_qtde_pecas_atacado;
    private String prod_base_icms;
    private BigDecimal prod_valor_base_icms;
    private BigDecimal prod_desconto;
    private String prod_marca;
    private BigDecimal prod_ipi_entrada;
    private BigDecimal prod_ipi_saida;
    private String prod_ncm;
    private String prod_materia_prima;
    private String prod_materia_servico;
    private String prod_uso_consumo;
    private String prod_inf_adicionais;
    private String prod_industrializado;
    private String prod_icms_monofasico;
    private String prod_tipo_sit_trib_entrada;
    private String prod_tipo_sit_trib_saida;
    private String prod_cod_sit_entrada;
    private String prod_cod_sit_saida;
    private BigDecimal prod_icms_int_entrada;
    private BigDecimal prod_icms_int_saida;
    private BigDecimal prod_icms_red_entrada;
    private BigDecimal prod_icms_red_saida;
    private BigDecimal prod_subst_reducao;
    private BigDecimal prod_subst_icms;
    private BigDecimal prod_subst_margem;
    private String prod_cst_pis_cofins_entrada;
    private BigDecimal prod_pis_entrada;
    private BigDecimal prod_cofins_entrada;
    private String prod_cst_pis_cofins_saida;
    private BigDecimal prod_pis_saida;
    private BigDecimal prod_cofins_saida;
    private Integer prod_origem;
    private BigDecimal prod_iss_saida;
    private BigDecimal prod_iof_saida;
    private BigDecimal prod_aliq_ibpt_nac;
    private BigDecimal prod_aliq_ibpt_imp;
    private BigDecimal prod_aliq_ibpt_mun;
    private BigDecimal prod_aliq_ibpt_est;
    private String prod_pode_desconto;
    private BigDecimal prod_mult_desc_extra;
    private String prod_cst_ipi_entrada;
    private String prod_cst_ipi_saida;
    private String prod_referencia;
    private BigDecimal prod_subst_icms_ent;
    private BigDecimal prod_subst_mva_ent;
    private BigDecimal prod_subst_icms_red_ent;
    private BigDecimal prod_aliq_red_icms_saida;
    private BigDecimal prod_aliq_deson_icms;
    private String prod_codigo_barra_caixa;
    private String prod_termo_recebimento1;
    private String prod_termo_recebimento2;
}    
   
    
    
    
    
   