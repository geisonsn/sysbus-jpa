package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the endereco database table.
 * 
 */
@Entity
@Table(name="endereco")
@NamedQuery(name="Endereco.findAll", query="SELECT e FROM Endereco e")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String cep;

	private String complemento;

	private String latitude;

	private String longitude;

	@Column(name="numero_andar")
	private String numeroAndar;

	@Column(name="numero_apartamento")
	private String numeroApartamento;

	@Column(name="numero_residencia")
	private String numeroResidencia;

	//uni-directional many-to-one association to Logradouro
	@ManyToOne
	@JoinColumn(name="id_logradouro")
	private Logradouro logradouro1;

	//uni-directional many-to-one association to Logradouro
	@ManyToOne
	@JoinColumn(name="id_cruzamento")
	private Logradouro logradouro2;

	//uni-directional many-to-one association to PontoReferencia
	@ManyToOne
	@JoinColumn(name="id_ponto_referencia")
	private PontoReferencia pontoReferencia;

	//uni-directional many-to-one association to Conjunto
	@ManyToOne
	@JoinColumn(name="id_conjunto")
	private Conjunto conjunto;

	public Endereco() {
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

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNumeroAndar() {
		return this.numeroAndar;
	}

	public void setNumeroAndar(String numeroAndar) {
		this.numeroAndar = numeroAndar;
	}

	public String getNumeroApartamento() {
		return this.numeroApartamento;
	}

	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public String getNumeroResidencia() {
		return this.numeroResidencia;
	}

	public void setNumeroResidencia(String numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}

	public Logradouro getLogradouro1() {
		return this.logradouro1;
	}

	public void setLogradouro1(Logradouro logradouro1) {
		this.logradouro1 = logradouro1;
	}

	public Logradouro getLogradouro2() {
		return this.logradouro2;
	}

	public void setLogradouro2(Logradouro logradouro2) {
		this.logradouro2 = logradouro2;
	}

	public PontoReferencia getPontoReferencia() {
		return this.pontoReferencia;
	}

	public void setPontoReferencia(PontoReferencia pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public Conjunto getConjunto() {
		return this.conjunto;
	}

	public void setConjunto(Conjunto conjunto) {
		this.conjunto = conjunto;
	}

}