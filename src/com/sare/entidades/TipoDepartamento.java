package com.sare.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TIPO_DEPTO")
public class TipoDepartamento implements Serializable {
	private static final long serialVersionUID = 1l;
	
	@Id
	@SequenceGenerator(name = "TBL_TIPO_DEPTO", initialValue = 1)
	@GeneratedValue(generator = "TBL_TIPO_DEPTO", strategy = GenerationType.AUTO)
	private long id;

}
