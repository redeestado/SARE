package com.sare.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.sare.dao.MeuDao;
import com.sare.dao.impl.MeuDaoImpl;
import com.sare.entidades.Cidade;

@FacesConverter(value = "converterCidade")
public class CidadeConverter implements Converter {

	/**
	 * Primeiro M�todo O m�todo getAsObject � invocado quando o ManagedBean
	 * precisa de algum valor que esteja na View, ent�o ele pega o valor da View
	 * que est� em String e converte para um Objeto para que o ManagedBean possa
	 * utilizar.
	 * 
	 */
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.equals("")) {
			MeuDao dao = new MeuDaoImpl();
			return dao.getByIdCidade(Long.valueOf(value));
		}
		return null;
	}

	/**
	 * Segundo M�todo O m�todo getAsString � invocado quando a View precisa
	 * apresentar algum valor, ent�o o Objeto � convertido para uma String que
	 * possa ser apresentada.
	 */

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Cidade) {
			Cidade municipio = (Cidade) value;
			return String.valueOf(municipio.getIdCidade());

		}
		return "";
	}

}
