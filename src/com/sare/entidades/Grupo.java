package com.sare.entidades;

public enum Grupo {
	ENTRADA("Entrada"),
	DESPESAFIXA("Despesa Fixa"),
	FUNCIONÁRIO("Funcionário"),
	TAXA("Taxa");

	private String label;
	
	private Grupo(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
