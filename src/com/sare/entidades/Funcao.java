package com.sare.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FUNCAO")
public class Funcao implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@SequenceGenerator(name = "seq_funcao", initialValue = 1)
	@GeneratedValue(generator = "seq_funcao", strategy = GenerationType.AUTO)
	private long id;

}
