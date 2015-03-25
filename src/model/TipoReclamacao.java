package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_reclamacao database table.
 * 
 */
@Entity
@Table(name="tipo_reclamacao")
@NamedQuery(name="TipoReclamacao.findAll", query="SELECT t FROM TipoReclamacao t")
public class TipoReclamacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descricao;

	public TipoReclamacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}