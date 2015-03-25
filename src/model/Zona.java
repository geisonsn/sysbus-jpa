package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the zona database table.
 * 
 */
@Entity
@Table(name="zona")
@NamedQuery(name="Zona.findAll", query="SELECT z FROM Zona z")
public class Zona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nome;

	//uni-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private Municipio municipio;

	public Zona() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}