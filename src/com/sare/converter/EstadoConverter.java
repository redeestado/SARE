package com.sare.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.sare.dao.MeuDao;
import com.sare.dao.impl.MeuDaoImpl;
import com.sare.entidades.Estado;

@FacesConverter(value="converterEstado")
public class EstadoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value!=null && !value.equals("")){
			MeuDao dao = new MeuDaoImpl();
			return dao.getByIdEstado(Long.valueOf(value));
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof Estado){
			Estado estado = (Estado)value;
			return String.valueOf(estado.getIdEstado());
		}
		return "";
	}
	
	

}
