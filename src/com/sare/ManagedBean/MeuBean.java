package com.sare.ManagedBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import com.sare.dao.MeuDao;
import com.sare.dao.impl.MeuDaoImpl;
import com.sare.entidades.Cidade;
import com.sare.entidades.Estado;

/**
 * 
 * @author Rede Estado Defini um ManagedBean com @ViewScoped, na qual o meu
 *         ManagedBean só vai perder os valores quando eu trocar de página.
 *
 */
@ManagedBean
@ViewScoped
public class MeuBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final MeuDao dao = new MeuDaoImpl();
	@SuppressWarnings("rawtypes")
	private List estados;
	@SuppressWarnings("rawtypes")
	private List cidades;
	private Cidade cidade;
	private Estado estado;

	public MeuBean() {
	}

	/**
	 * Em cima do método init() declarei uma Annotation @PostConstruct que vai
	 * fazer que meu método init() seja invocado toda vez que meu ManagedBean
	 * seja criado. Isso vai fazer com que sempre que eu inicie a página o meu
	 * combo de estados venha com todos os estados.
	 */
	@PostConstruct
	public void init() {
		estados = dao.consultaTodosEstados();
		cidades = dao.consultaCidades(estado);

	}

	/**
	 * O outro método listaCidades tem um parametro AjaxBehaviorEvent, mais
	 * porque isso? Porque quando utilizamos o atributo listener do nosso
	 * component f:ajax somos obrigados a declarar a assinatura do método com um
	 * AjaxBehaviorEvent, que foi o caso do listaCidades. Esse método vai listar
	 * todas cidades que um determinado estado tem, e vai atribuir a lista de
	 * cidades.
	 * 
	 * @param event
	 */

	public void listarCidades(AjaxBehaviorEvent event) {
		cidades = dao.consultaCidades(estado);
	}


	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@SuppressWarnings("rawtypes")
	public List getEstados() {
		return estados;
	}

	@SuppressWarnings("rawtypes")
	public void setEstados(List estados) {
		this.estados = estados;
	}

	@SuppressWarnings("rawtypes")
	public List getCidades() {
		return cidades;
	}

	public void setCidades(@SuppressWarnings("rawtypes") List cidades) {
		this.cidades = cidades;
	}

	public MeuDao getDao() {
		return dao;
	}

	
}
