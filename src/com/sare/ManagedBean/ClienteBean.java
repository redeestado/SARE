package com.sare.ManagedBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import com.sare.dao.Dao;
import com.sare.entidades.ClientePF;
import com.sare.util.jsf.FacesUtil;

@ManagedBean
public class ClienteBean {

	/**
	 * Criar uma instancia do objeto para não dar o erro "target clientePF null"
	 */
	private ClientePF clientePF = new ClientePF();

	@SuppressWarnings("unused")
	private ArrayList<ClientePF> listaClientes = new ArrayList<ClientePF>();

	public String editar(ClientePF clientePF) {
		this.clientePF = clientePF;
		return "cadpf.xhtml";
	}
	
	public void prepararExclusao(ClientePF clientePF){
		this.clientePF = clientePF;		
	}
		
	public void excluir(){
		 Dao.getInstance().deletarObjeto(clientePF);
		FacesUtil.addInfoMessage("Cadastro excluído com Sucesso!!!");
		
	}
	
	public String getDataAtual(){
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}
	
	public void prepararInclusao(){
		cadastrar();		
	}

	public String cadastrar() {
		System.out.println(clientePF.toString());
		try {
			if(clientePF.getId()>=1){
				Dao.getInstance().salvarOuAtualizarObjeto(clientePF);
				FacesUtil.addInfoMessage("Cadastrado atualizado com Sucesso!!!");	
				return "cadpf.xhtml";
						
			}else{
				System.out.println(clientePF.toString());
				Dao.getInstance().salvarObjeto(clientePF);
				FacesUtil.addInfoMessage("Cadastrado com Sucesso!!!");	
				return "home.xhtml";
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Limpar();
		return "home.xhtml";

	}
	
	public String atualizar() {
		try {
			System.out.println(clientePF.toString());
			Dao.getInstance().salvarOuAtualizarObjeto(clientePF);;
			FacesUtil.addInfoMessage("Cadastrado atualizado com Sucesso!!!");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		Limpar();
		return "home.xhtml";

	}

	private void Limpar() {
		clientePF = new ClientePF();
	}

	public ClientePF getClientePF() {
		return clientePF;
	}

	public void setClientePF(ClientePF clientePF) {
		this.clientePF = clientePF;
	}
	

	@SuppressWarnings("unchecked")
	public ArrayList<ClientePF> getListaClientes() {
	 
		return  (ArrayList<ClientePF>) Dao.getInstance().listarObjetos(ClientePF.class);
		 
	}

	public void setListaClientes(ArrayList<ClientePF> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
