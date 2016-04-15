package com.sare.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_OCORRENCIAS")
public class Ocorrencias implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@SequenceGenerator(name = "seq_ocorrencias", initialValue = 1)
	@GeneratedValue(generator = "seq_ocorrencias", strategy = GenerationType.AUTO)
	private long id;

}
