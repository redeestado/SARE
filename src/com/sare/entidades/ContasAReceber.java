package com.sare.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.type.ImageType;

@Entity
@Table(name = "contasareceber")
public class ContasAReceber implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date vencimento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date pagamento;
	@Column(length = 20)
	private String cliente;
	@Column(length = 14)
	private String cpf;
	@Column(length = 19)
	private String cnpj;
	@Column(length = 50)
	private String cbarras;
	@Column(length = 30)
	private String servico;
	@Column(length = 20)
	private String referente;
	@Column(length = 20)
	private String formapagto;
	@Column(length = 30)
	private String historico;
	private Float valor;
	private Float acrescimo;
	private Float desconto;
	private Float total;
	@Column(length = 20)
	private String grupo;
	@Column(length = 20)
	private String subgrupo;
	@Column(length = 1)
	private String tipo;
	@Column(length = 20)
	private String operacao;
	@Column(length = 10)
	private String codbanco;
	@Column(length = 20)
	private String banco;
	@Column(length = 20)
	private String nossonr;
	@Column(length = 20)
	private String outronr;
	@Column(length = 20)
	private String usuario;
	private ImageType comprovante;
	@Column(length = 1)
	private String mark;

	public ContasAReceber() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCbarras() {
		return cbarras;
	}

	public void setCbarras(String cbarras) {
		this.cbarras = cbarras;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getReferente() {
		return referente;
	}

	public void setReferente(String referente) {
		this.referente = referente;
	}

	public String getFormapagto() {
		return formapagto;
	}

	public void setFormapagto(String formapagto) {
		this.formapagto = formapagto;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Float getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Float acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Float getDesconto() {
		return desconto;
	}

	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSubgrupo() {
		return subgrupo;
	}

	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public String getCodbanco() {
		return codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNossonr() {
		return nossonr;
	}

	public void setNossonr(String nossonr) {
		this.nossonr = nossonr;
	}

	public String getOutronr() {
		return outronr;
	}

	public void setOutronr(String outronr) {
		this.outronr = outronr;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public ImageType getComprovante() {
		return comprovante;
	}

	public void setComprovante(ImageType comprovante) {
		this.comprovante = comprovante;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
