package com.sare.entidades;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FUNCINARIO")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq_funcionario", initialValue = 1)
	@GeneratedValue(generator = "seq_funcionario", strategy = GenerationType.AUTO)
	private long id_func;
	private String nome;
	private Date dataNasc;
	private String rg;
	private String cpf;
	private String fone;
	private String celular;
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private String complemento;
	private String referencia;
	private String cidade;
	private String uf;
	private String mae;
	private String pai;
	private String email;
	private String facebook;
	private Date admissao;
	private Date demissao;
	private String cbpo;
	private String cargo;
	private String departamento;
	private String contrato;
	private String ctps;
	private String pis;
	private String banco;
	private String agencia;
	private String conta_bancaria;
	private Double salario;
	private String nome_dependente;
	private Date dt_nasc_dependente;
	private String tipo_documento;
	private int num_documento;
	private String observacao;
	private byte[] foto_func;
	
	public Funcionario(){
		super();
	}

	public long getId_func() {
		return id_func;
	}

	public void setId_func(long id_func) {
		this.id_func = id_func;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Date getDemissao() {
		return demissao;
	}

	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}

	public String getCbpo() {
		return cbpo;
	}

	public void setCbpo(String cbpo) {
		this.cbpo = cbpo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta_bancaria() {
		return conta_bancaria;
	}

	public void setConta_bancaria(String conta_bancaria) {
		this.conta_bancaria = conta_bancaria;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome_dependente() {
		return nome_dependente;
	}

	public void setNome_dependente(String nome_dependente) {
		this.nome_dependente = nome_dependente;
	}

	public Date getDt_nasc_dependente() {
		return dt_nasc_dependente;
	}

	public void setDt_nasc_dependente(Date dt_nasc_dependente) {
		this.dt_nasc_dependente = dt_nasc_dependente;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(int num_documento) {
		this.num_documento = num_documento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public byte[] getFoto_func() {
		return foto_func;
	}

	public void setFoto_func(byte[] foto_func) {
		this.foto_func = foto_func;
	}

	@Override
	public String toString() {
		return "Funcionario [id_func=" + id_func + ", nome=" + nome + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf="
				+ cpf + ", fone=" + fone + ", celular=" + celular + ", rua=" + rua + ", numero=" + numero + ", bairro="
				+ bairro + ", cep=" + cep + ", complemento=" + complemento + ", referencia=" + referencia + ", cidade="
				+ cidade + ", uf=" + uf + ", mae=" + mae + ", pai=" + pai + ", email=" + email + ", facebook="
				+ facebook + ", admissao=" + admissao + ", demissao=" + demissao + ", cbpo=" + cbpo + ", cargo=" + cargo
				+ ", departamento=" + departamento + ", contrato=" + contrato + ", ctps=" + ctps + ", pis=" + pis
				+ ", banco=" + banco + ", agencia=" + agencia + ", conta_bancaria=" + conta_bancaria + ", salario="
				+ salario + ", nome_dependente=" + nome_dependente + ", dt_nasc_dependente=" + dt_nasc_dependente
				+ ", tipo_documento=" + tipo_documento + ", num_documento=" + num_documento + ", observacao="
				+ observacao + ", foto_func=" + Arrays.toString(foto_func) + "]";
	}

}
