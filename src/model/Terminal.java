package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the terminal database table.
 * 
 */
@Entity
@Table(name="terminal")
@NamedQuery(name="Terminal.findAll", query="SELECT t FROM Terminal t")
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descricao;

	//uni-directional many-to-one association to Endereco
	@ManyToOne
	@JoinColumn(name="id_endereco")
	private Endereco endereco;

	public Terminal() {
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

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}