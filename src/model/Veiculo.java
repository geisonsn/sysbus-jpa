package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the veiculo database table.
 * 
 */
@Entity
@Table(name="veiculo")
@NamedQuery(name="Veiculo.findAll", query="SELECT v FROM Veiculo v")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="numero_registro")
	private String numeroRegistro;

	private String placa;

	//uni-directional many-to-one association to Linha
	@ManyToOne
	@JoinColumn(name="id_linha")
	private Linha linha;

	public Veiculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroRegistro() {
		return this.numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

}