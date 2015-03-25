package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_logradouro database table.
 * 
 */
@Entity
@Table(name="tipo_logradouro")
@NamedQuery(name="TipoLogradouro.findAll", query="SELECT t FROM TipoLogradouro t")
public class TipoLogradouro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String abreviatura;

	private String nome;

	public TipoLogradouro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}