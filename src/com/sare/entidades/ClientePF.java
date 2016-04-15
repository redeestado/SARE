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
import javax.validation.constraints.Pattern;

import org.hibernate.type.ImageType;
import org.hibernate.validator.constraints.br.CPF;


@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_clientepf")
public class ClientePF implements Serializable {


	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	@CPF(message="CPF inv�lido")
	private String cpf;
	@Column(length = 50)
	private String nome;
	@Column(length = 15)
	private String rg;
	@Column(length = 20)
	private String te;
	@Column(length = 30)
	private String fone;
	@Column(length = 30)
	private String celular;
	@Column(length = 9)
	private String cep;
	@Column(length = 50)
	private String rua;
	@Column(length = 10)
	private String nr;
	@Column(length = 20)
	private String compl;
	@Column(length = 30)
	private String bairro;
	@Column(length = 50)
	private String cidade;
	@Column(length = 2)
	private String estado;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtnasc;
	@Column(length = 30)
	private String naturalidade;
	@Column(length = 2)
	private String naturalestado;
	@Column(length = 50)
	private String pontoref;
	@Column(length = 30)
	private String mae;
	@Column(length = 30)
	private String pai;
	@Pattern(regexp = ".+@.+\\.[a-z]+")
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String facebook;
	@Column(length = 30)
	private String site;
	@Column(length = 1,nullable=true)
	private boolean mark;
	@Column(length = 20)
	private String permissao;
	@Column(length = 20)
	private String acc;
	@Column(length = 20)
	private String registro;
	@Temporal(TemporalType.TIMESTAMP)
	private Date primeirahab;
	@Column(length = 20)
	private String numcnh;
	@Column(length = 50)
	private String obs1;
	@Column(length = 50)
	private String obs2;
	@Column(length = 10)
	private String categoria;
	@Temporal(TemporalType.TIMESTAMP)
	private Date validade;
	@Column(length = 12)
	private String reservista;
	@Column(length = 15)
	private String passaporte;
	@Column(length = 15)
	private String outros;
	@Column(length = 30)
	private String obs1cnh;
	@Column(length = 30)
	private String obs2cnh;
	@Column(length = 20)
	private String nacionalidade;
	private ImageType digital1;
	private ImageType digital2;
	private ImageType digital3;
	private ImageType digital4;
	private ImageType digital5;
	private ImageType digital6;
	private ImageType digital7;
	private ImageType digital8;
	private ImageType digital9;
	private ImageType digital10;
	private ImageType foto1;
	private ImageType foto2;
	private ImageType foto3;
	private ImageType foto4;
	private ImageType foto5;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtcad;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTe() {
		return te;
	}

	public void setTe(String te) {
		this.te = te;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getCompl() {
		return compl;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getPontoref() {
		return pontoref;
	}

	public void setPontoref(String pontoref) {
		this.pontoref = pontoref;
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public boolean isMark() {
		return mark;
	}

	public void setMark(boolean mark) {
		this.mark = mark;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public Date getPrimeirahab() {
		return primeirahab;
	}

	public void setPrimeirahab(Date primeirahab) {
		this.primeirahab = primeirahab;
	}

	public String getNumcnh() {
		return numcnh;
	}

	public void setNumcnh(String numcnh) {
		this.numcnh = numcnh;
	}

	public String getObs1() {
		return obs1;
	}

	public void setObs1(String obs1) {
		this.obs1 = obs1;
	}

	public String getObs2() {
		return obs2;
	}

	public void setObs2(String obs2) {
		this.obs2 = obs2;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public ImageType getDigital1() {
		return digital1;
	}

	public void setDigital1(ImageType digital1) {
		this.digital1 = digital1;
	}

	public ImageType getDigital2() {
		return digital2;
	}

	public void setDigital2(ImageType digital2) {
		this.digital2 = digital2;
	}

	public ImageType getDigital3() {
		return digital3;
	}

	public void setDigital3(ImageType digital3) {
		this.digital3 = digital3;
	}

	public ImageType getDigital4() {
		return digital4;
	}

	public void setDigital4(ImageType digital4) {
		this.digital4 = digital4;
	}

	public ImageType getDigital5() {
		return digital5;
	}

	public void setDigital5(ImageType digital5) {
		this.digital5 = digital5;
	}

	public ImageType getDigital6() {
		return digital6;
	}

	public void setDigital6(ImageType digital6) {
		this.digital6 = digital6;
	}

	public ImageType getDigital7() {
		return digital7;
	}

	public void setDigital7(ImageType digital7) {
		this.digital7 = digital7;
	}

	public ImageType getDigital8() {
		return digital8;
	}

	public void setDigital8(ImageType digital8) {
		this.digital8 = digital8;
	}

	public ImageType getDigital9() {
		return digital9;
	}

	public void setDigital9(ImageType digital9) {
		this.digital9 = digital9;
	}

	public ImageType getDigital10() {
		return digital10;
	}

	public void setDigital10(ImageType digital10) {
		this.digital10 = digital10;
	}

	public ImageType getFoto1() {
		return foto1;
	}

	public void setFoto1(ImageType foto1) {
		this.foto1 = foto1;
	}

	public ImageType getFoto2() {
		return foto2;
	}

	public void setFoto2(ImageType foto2) {
		this.foto2 = foto2;
	}

	public ImageType getFoto3() {
		return foto3;
	}

	public void setFoto3(ImageType foto3) {
		this.foto3 = foto3;
	}

	public ImageType getFoto4() {
		return foto4;
	}

	public void setFoto4(ImageType foto4) {
		this.foto4 = foto4;
	}

	public ImageType getFoto5() {
		return foto5;
	}

	public void setFoto5(ImageType foto5) {
		this.foto5 = foto5;
	}

	public Date getDtcad() {
		return dtcad;
	}

	public void setDtcad(Date dtcad) {
		this.dtcad = dtcad;
	}

	public String getNaturalestado() {
		return naturalestado;
	}

	public void setNaturalestado(String naturalestado) {
		this.naturalestado = naturalestado;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	public String getObs1cnh() {
		return obs1cnh;
	}

	public void setObs1cnh(String obs1cnh) {
		this.obs1cnh = obs1cnh;
	}

	public String getObs2cnh() {
		return obs2cnh;
	}

	public void setObs2cnh(String obs2cnh) {
		this.obs2cnh = obs2cnh;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@Override
	public String toString() {
		return "ClientePF [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", te=" + te + ", fone="
				+ fone + ", celular=" + celular + ", cep=" + cep + ", rua=" + rua + ", nr=" + nr + ", compl=" + compl
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", dtnasc=" + dtnasc
				+ ", naturalidade=" + naturalidade + ", naturalestado=" + naturalestado + ", pontoref=" + pontoref
				+ ", mae=" + mae + ", pai=" + pai + ", email=" + email + ", facebook=" + facebook + ", site=" + site
				+ ", mark=" + mark + ", permissao=" + permissao + ", acc=" + acc + ", registro=" + registro
				+ ", primeirahab=" + primeirahab + ", numcnh=" + numcnh + ", obs1=" + obs1 + ", obs2=" + obs2
				+ ", categoria=" + categoria + ", validade=" + validade + ", reservista=" + reservista + ", passaporte="
				+ passaporte + ", outros=" + outros + ", obs1cnh=" + obs1cnh + ", obs2cnh=" + obs2cnh
				+ ", nacionalidade=" + nacionalidade + ", digital1=" + digital1 + ", digital2=" + digital2
				+ ", digital3=" + digital3 + ", digital4=" + digital4 + ", digital5=" + digital5 + ", digital6="
				+ digital6 + ", digital7=" + digital7 + ", digital8=" + digital8 + ", digital9=" + digital9
				+ ", digital10=" + digital10 + ", foto1=" + foto1 + ", foto2=" + foto2 + ", foto3=" + foto3 + ", foto4="
				+ foto4 + ", foto5=" + foto5 + ", dtcad=" + dtcad + "]";
	}
	
	

}
