package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bairro database table.
 * 
 */
@Entity
@Table(name="bairro")
@NamedQuery(name="Bairro.findAll", query="SELECT b FROM Bairro b")
public class Bairro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nome;

	//uni-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private Municipio municipio;

	//uni-directional many-to-one association to Zona
	@ManyToOne
	@JoinColumn(name="id_zona")
	private Zona zona;

	public Bairro() {
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

	public Zona getZona() {
		return this.zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}