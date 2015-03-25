package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the reclamacao database table.
 * 
 */
@Entity
@Table(name="reclamacao")
@NamedQuery(name="Reclamacao.findAll", query="SELECT r FROM Reclamacao r")
public class Reclamacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_ocorrencia")
	private Date dataOcorrencia;

	@Column(name="data_registro")
	private Timestamp dataRegistro;

	private String descricao;

	private Time hora;

	@Column(name="placa_linha")
	private String placaLinha;

	//uni-directional many-to-one association to OrigemReclamacao
	@ManyToOne
	@JoinColumn(name="id_origem_reclamacao")
	private OrigemReclamacao origemReclamacao;

	//uni-directional many-to-one association to Linha
	@ManyToOne
	@JoinColumn(name="id_linha")
	private Linha linha;

	public Reclamacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataOcorrencia() {
		return this.dataOcorrencia;
	}

	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	public Timestamp getDataRegistro() {
		return this.dataRegistro;
	}

	public void setDataRegistro(Timestamp dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getPlacaLinha() {
		return this.placaLinha;
	}

	public void setPlacaLinha(String placaLinha) {
		this.placaLinha = placaLinha;
	}

	public OrigemReclamacao getOrigemReclamacao() {
		return this.origemReclamacao;
	}

	public void setOrigemReclamacao(OrigemReclamacao origemReclamacao) {
		this.origemReclamacao = origemReclamacao;
	}

	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

}