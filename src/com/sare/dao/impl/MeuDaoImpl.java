package com.sare.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.sare.dao.MeuDao;
import com.sare.entidades.Cidade;
import com.sare.entidades.Estado;
import com.sare.hibernate.HibernateUtility;

public class MeuDaoImpl implements MeuDao {

	@SuppressWarnings("rawtypes")
	@Override
	public List consultaTodosEstados() {
		Criteria crit = HibernateUtility.getSession().createCriteria(Estado.class);
		return crit.list();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List consultaCidades(Estado estado) {
		Criteria crit = HibernateUtility.getSession().createCriteria(Cidade.class);
		crit.add(Restrictions.eq("estado", estado));
		return crit.list();
	}

	@Override
	public Cidade getByIdCidade(Long id) {
		return (Cidade) HibernateUtility.getSession().get(Cidade.class, id);

	}

	@Override
	public Estado getByIdEstado(Long id) {
		return (Estado) HibernateUtility.getSession().get(Estado.class, id);
	}

}
