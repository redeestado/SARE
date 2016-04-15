package com.sare.teste;

import com.sare.dao.Dao;
import com.sare.entidades.ClientePF;

public class ClientePFTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dao dao = new Dao();
	
	ClientePF cli = new ClientePF();
	
	cli.setCpf("15908948802");
	cli.setNome("Gilson G.Ribeiro");
	cli.setRg("258401540");
	cli.setRua("Nelson Rampim");
	cli.setNr("228");
	cli.setBairro("Jardim Santa Esmeralda");
	
	
	
	Dao.getInstance().salvarObjeto(cli);
	dao.salvarObjeto(cli);
	}

}
