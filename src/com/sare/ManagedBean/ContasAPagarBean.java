package com.sare.ManagedBean;

import java.util.ArrayList;

import com.sare.dao.Dao;
import com.sare.entidades.ContasAPagar;
import com.sare.util.jsf.FacesUtil;

public class ContasAPagarBean {

	private String opcao;
	private ContasAPagar contasAPagar = new ContasAPagar();

	private ArrayList<ContasAPagarBean> listarContasAPagar = new ArrayList<ContasAPagarBean>();

	public String lancarContasAPagar() {
		System.out.println(contasAPagar.toString());
		try {
			if (contasAPagar.getId() >= 1) {
				Dao.getInstance().salvarOuAtualizarObjeto(contasAPagar);
				FacesUtil.addInfoMessage("Conta cadastrada com sucesso!!!");
				return "home.xhtml";
			} else {
				System.out.println(contasAPagar.toString());
				Dao.getInstance().salvarObjeto(contasAPagar);
				FacesUtil.addInfoMessage("Atualizado com sucesso!!!");
				return "home.xhtml";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		limpar();
		return "home.xhtml";

	}

	public void prepararExclusao(ContasAPagar contasAPagar) {
		this.contasAPagar = contasAPagar;
	}

	public void excluir() {
		Dao.getInstance().deletarObjeto(contasAPagar);
		FacesUtil.addInfoMessage("Conta exclu�da com sucesso!!!");
	}

	public String editar(ContasAPagar contasAPagar) {
		this.contasAPagar = new ContasAPagar();
		return "contasapagar.xhtml";
	}

	public boolean isCPF() {
		return getOpcao() != null && getOpcao().equals("Cpf");
	}

	public boolean isCNPJ() {
		return getOpcao() != null && getOpcao().equals("Cnpj");
	}

	public void limpar() {
		contasAPagar = new ContasAPagar();
	}

	public ContasAPagar getContasAPagar() {
		return contasAPagar;
	}

	public void setContasAPagar(ContasAPagar contasAPagar) {
		this.contasAPagar = contasAPagar;
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public ArrayList<ContasAPagarBean> getListarContasAPagar() {
		return listarContasAPagar;
	}

	public void setListarContasAPagar(ArrayList<ContasAPagarBean> listarContasAPagar) {
		this.listarContasAPagar = listarContasAPagar;
	}

}
