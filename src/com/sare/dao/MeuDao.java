package com.sare.dao;

import java.util.List;

import com.sare.entidades.Cidade;
import com.sare.entidades.Estado;

public interface MeuDao {

	@SuppressWarnings("rawtypes")
	public List consultaTodosEstados();

	@SuppressWarnings("rawtypes")
	public List consultaCidades(Estado estado);

	public Cidade getByIdCidade(Long id);

	public Estado getByIdEstado(Long id);

}
