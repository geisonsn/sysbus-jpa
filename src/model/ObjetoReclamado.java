package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the objeto_reclamado database table.
 * 
 */
@Entity
@Table(name="objeto_reclamado")
@NamedQuery(name="ObjetoReclamado.findAll", query="SELECT o FROM ObjetoReclamado o")
public class ObjetoReclamado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descricao;

	private String sigla;

	public ObjetoReclamado() {
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

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}