package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the linha database table.
 * 
 */
@Entity
@Table(name="linha")
@NamedQuery(name="Linha.findAll", query="SELECT l FROM Linha l")
public class Linha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descricao;

	private String numero;

	//uni-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa;

	//uni-directional many-to-one association to TipoLinha
	@ManyToOne
	@JoinColumn(name="id_tipo_linha")
	private TipoLinha tipoLinha;

	//uni-directional many-to-one association to Terminal
	@ManyToOne
	@JoinColumn(name="id_terminal")
	private Terminal terminal;

	public Linha() {
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

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public TipoLinha getTipoLinha() {
		return this.tipoLinha;
	}

	public void setTipoLinha(TipoLinha tipoLinha) {
		this.tipoLinha = tipoLinha;
	}

	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

}