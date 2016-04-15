package com.sare.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "convertInput")
public class InputConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String valor) {
		if (valor != null || valor != "") {
			valor = valor.toString().replaceAll("[- /,]", "");
			valor = valor.toString().replaceAll("[-()]", "");
		}
		return Float.parseFloat(valor);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object valor) {
		return valor.toString();
	}
}
