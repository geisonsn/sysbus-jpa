package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the origem_reclamacao database table.
 * 
 */
@Entity
@Table(name="origem_reclamacao")
@NamedQuery(name="OrigemReclamacao.findAll", query="SELECT o FROM OrigemReclamacao o")
public class OrigemReclamacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//uni-directional many-to-one association to ObjetoReclamado
	@ManyToOne
	@JoinColumn(name="id_objeto_reclamado")
	private ObjetoReclamado objetoReclamado;

	//uni-directional many-to-one association to TipoReclamacao
	@ManyToOne
	@JoinColumn(name="id_tipo_reclamacao")
	private TipoReclamacao tipoReclamacao;

	public OrigemReclamacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ObjetoReclamado getObjetoReclamado() {
		return this.objetoReclamado;
	}

	public void setObjetoReclamado(ObjetoReclamado objetoReclamado) {
		this.objetoReclamado = objetoReclamado;
	}

	public TipoReclamacao getTipoReclamacao() {
		return this.tipoReclamacao;
	}

	public void setTipoReclamacao(TipoReclamacao tipoReclamacao) {
		this.tipoReclamacao = tipoReclamacao;
	}

}