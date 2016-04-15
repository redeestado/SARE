package com.sare.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_SERVICO")
public class Servico implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@SequenceGenerator(name = "seq_servico", initialValue = 1)
	@GeneratedValue(generator = "seq_servico", strategy = GenerationType.AUTO)
	private long id;
	

}
