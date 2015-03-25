package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the localizacao_linha database table.
 * 
 */
@Entity
@Table(name="localizacao_linha")
@NamedQuery(name="LocalizacaoLinha.findAll", query="SELECT l FROM LocalizacaoLinha l")
public class LocalizacaoLinha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="data_hora_registro")
	private Timestamp dataHoraRegistro;

	private String latitude;

	private String longitude;

	//uni-directional many-to-one association to Veiculo
	@ManyToOne
	@JoinColumn(name="id_veiculo")
	private Veiculo veiculo;

	public LocalizacaoLinha() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDataHoraRegistro() {
		return this.dataHoraRegistro;
	}

	public void setDataHoraRegistro(Timestamp dataHoraRegistro) {
		this.dataHoraRegistro = dataHoraRegistro;
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

	public Veiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}