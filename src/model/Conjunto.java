package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conjunto database table.
 * 
 */
@Entity
@Table(name="conjunto")
@NamedQuery(name="Conjunto.findAll", query="SELECT c FROM Conjunto c")
public class Conjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="id_tipo_localidade")
	private int idTipoLocalidade;

	private String nome;

	//uni-directional many-to-one association to Bairro
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private Bairro bairro;

	//uni-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private Municipio municipio;

	public Conjunto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTipoLocalidade() {
		return this.idTipoLocalidade;
	}

	public void setIdTipoLocalidade(int idTipoLocalidade) {
		this.idTipoLocalidade = idTipoLocalidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}