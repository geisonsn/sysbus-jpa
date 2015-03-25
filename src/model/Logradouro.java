package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logradouro database table.
 * 
 */
@Entity
@Table(name="logradouro")
@NamedQuery(name="Logradouro.findAll", query="SELECT l FROM Logradouro l")
public class Logradouro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String cep;

	@Column(name="id_tipo_logradouro")
	private int idTipoLogradouro;

	@Column(name="id_tipo_logradouro_antigo")
	private int idTipoLogradouroAntigo;

	@Column(name="id_tipo_logradouro_popular")
	private int idTipoLogradouroPopular;

	private String nome;

	@Column(name="nome_antigo")
	private String nomeAntigo;

	@Column(name="nome_popular")
	private String nomePopular;

	//uni-directional many-to-one association to Bairro
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private Bairro bairro;

	public Logradouro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getIdTipoLogradouro() {
		return this.idTipoLogradouro;
	}

	public void setIdTipoLogradouro(int idTipoLogradouro) {
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public int getIdTipoLogradouroAntigo() {
		return this.idTipoLogradouroAntigo;
	}

	public void setIdTipoLogradouroAntigo(int idTipoLogradouroAntigo) {
		this.idTipoLogradouroAntigo = idTipoLogradouroAntigo;
	}

	public int getIdTipoLogradouroPopular() {
		return this.idTipoLogradouroPopular;
	}

	public void setIdTipoLogradouroPopular(int idTipoLogradouroPopular) {
		this.idTipoLogradouroPopular = idTipoLogradouroPopular;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeAntigo() {
		return this.nomeAntigo;
	}

	public void setNomeAntigo(String nomeAntigo) {
		this.nomeAntigo = nomeAntigo;
	}

	public String getNomePopular() {
		return this.nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

}