package com.tresct.domain;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tramite")
public class Tramite {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int idTramite;
	private String tipoTramite;
	private Timestamp fechaTramite;
	
	//Crear la relacón @OneToOne
	@OneToOne( mappedBy="tramite"  , cascade = CascadeType.REMOVE)
	private Avaluo avaluo;
	
	@OneToMany(mappedBy = "tramite")
	private Set<DiarioCliente> diarioClienteSet;
	
	public Tramite() {
		
	}

	public Tramite( String tipoTramite, Timestamp fechaTramite) {		
		this.tipoTramite = tipoTramite;
		this.fechaTramite = fechaTramite;
	}

	public int getIdTramite() {
		return idTramite;
	}

	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public Timestamp getFechaTramite() {
		return fechaTramite;
	}

	public void setFechaTramite(Timestamp fechaTramite) {
		this.fechaTramite = fechaTramite;
	}

	@Override
	public String toString() {
		return "Tramite [idTramite=" + idTramite + ", tipoTramite=" + tipoTramite + ", fechaTramite=" + fechaTramite
				+ "]";
	}
}
