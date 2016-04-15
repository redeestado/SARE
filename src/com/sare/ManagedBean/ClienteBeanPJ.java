package com.sare.ManagedBean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import com.sare.dao.Dao;
import com.sare.entidades.ClientePJ;
import com.sare.util.jsf.FacesUtil;


@ManagedBean
public class ClienteBeanPJ {
	
      private ClientePJ clientePJ = new ClientePJ();

	@SuppressWarnings("unused")
	private ArrayList<ClientePJ> listarClientesPJ = new ArrayList<ClientePJ>();

   public String editarClientePJ(ClientePJ clientePJ){
	   this.clientePJ = clientePJ;
	return "cadpj.xhtml";
	   
   }
   
   public void prepararExclusaoCliPJ(ClientePJ clientePJ){
	   this.clientePJ = clientePJ;
   }
	
	public void excluirClientePJ() {
		Dao.getInstance().deletarObjeto(clientePJ);
		FacesUtil.addInfoMessage("Excluído com sucesso!!!");

	}

	public String cadastrarCliPJ() {
		System.out.println(clientePJ.toString());
		try {
			if (clientePJ.getId() >= 1) {
				Dao.getInstance().salvarOuAtualizarObjeto(clientePJ);
				FacesUtil.addInfoMessage("Cadastrado com sucesso!!!");
				return "home.xhtml";
			} else {
				System.out.println(clientePJ.toString());
				Dao.getInstance().salvarObjeto(clientePJ);
				return "home.xhtml";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		Limpar();
		return "home.xhtml";

	}
	
	public String atualizarCliPJ() {
		try {
			System.out.println(clientePJ.toString());
			Dao.getInstance().salvarOuAtualizarObjeto(clientePJ);;
			FacesUtil.addInfoMessage("Cadastrado atualizado com Sucesso!!!");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		Limpar();
		return "home.xhtml";

	}

	private void Limpar() {
		clientePJ = new ClientePJ();

	}
	 

	public ClientePJ getClientePJ() {
		return clientePJ;
	}

	public void setClientePJ(ClientePJ clientePJ) {
		this.clientePJ = clientePJ;
	}


	@SuppressWarnings("unchecked")
	public ArrayList<ClientePJ> getListarClientesPJ() {
		return  (ArrayList<ClientePJ>) Dao.getInstance().listarObjetos(ClientePJ.class);
	}

	public void setListarClientesPJ(ArrayList<ClientePJ> listarClientesPJ) {
		this.listarClientesPJ = listarClientesPJ;
	}

}
