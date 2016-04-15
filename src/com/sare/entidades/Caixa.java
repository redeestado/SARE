package com.sare.entidades;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Caixa implements Serializable{
	private static final long serialVersionUID = 1l;
	@Id
	@SequenceGenerator(name = "seq_caixa", initialValue = 1)
	@GeneratedValue(generator = "seq_caixa", strategy = GenerationType.AUTO)
	private long id;
	

}
