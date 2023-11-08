package edu.unoesc.cf.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import edu.unoesc.cf.dao.ContaDAO;
import edu.unoesc.cf.models.Conta;



@FacesConverter(value = "contaConverter", forClass = Conta.class)
public class ContaConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			Conta p = (Conta) component.getAttributes().get(value);
            return p;
        }
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null && (value instanceof Conta)) {
			Conta p = (Conta) value; 
			component.getAttributes().put( String.valueOf(p.getId()), p);
            return String.valueOf(p.getId());
        }
		return null;
	}
	
	
}