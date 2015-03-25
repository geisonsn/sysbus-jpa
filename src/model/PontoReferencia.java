package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ponto_referencia database table.
 * 
 */
@Entity
@Table(name="ponto_referencia")
@NamedQuery(name="PontoReferencia.findAll", query="SELECT p FROM PontoReferencia p")
public class PontoReferencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="classificacao_ponto")
	private int classificacaoPonto;

	private String complemento;

	private String descricao;

	private String endereco;

	@Column(name="id_tipo_ponto_referencia")
	private int idTipoPontoReferencia;

	@Column(name="numero_ponto")
	private String numeroPonto;

	@Column(name="sigla_ponto")
	private String siglaPonto;

	//uni-directional many-to-one association to Bairro
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private Bairro bairro;

	//uni-directional many-to-one association to Conjunto
	@ManyToOne
	@JoinColumn(name="id_conjunto")
	private Conjunto conjunto;

	public PontoReferencia() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassificacaoPonto() {
		return this.classificacaoPonto;
	}

	public void setClassificacaoPonto(int classificacaoPonto) {
		this.classificacaoPonto = classificacaoPonto;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdTipoPontoReferencia() {
		return this.idTipoPontoReferencia;
	}

	public void setIdTipoPontoReferencia(int idTipoPontoReferencia) {
		this.idTipoPontoReferencia = idTipoPontoReferencia;
	}

	public String getNumeroPonto() {
		return this.numeroPonto;
	}

	public void setNumeroPonto(String numeroPonto) {
		this.numeroPonto = numeroPonto;
	}

	public String getSiglaPonto() {
		return this.siglaPonto;
	}

	public void setSiglaPonto(String siglaPonto) {
		this.siglaPonto = siglaPonto;
	}

	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Conjunto getConjunto() {
		return this.conjunto;
	}

	public void setConjunto(Conjunto conjunto) {
		this.conjunto = conjunto;
	}

}