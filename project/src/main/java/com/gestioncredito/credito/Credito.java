package com.gestioncredito.credito;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Credito implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "descripcion del credido")
	private java.lang.String descripcionCredito;
	@org.kie.api.definition.type.Label(value = "valor credito")
	private java.lang.Integer valorCredito;
	@org.kie.api.definition.type.Label(value = "tiempo amortizacion en meses")
	private java.lang.Integer tiempoAmortizacion;

	public Credito() {
	}

	public java.lang.String getDescripcionCredito() {
		return this.descripcionCredito;
	}

	public void setDescripcionCredito(java.lang.String descripcionCredito) {
		this.descripcionCredito = descripcionCredito;
	}

	public java.lang.Integer getValorCredito() {
		return this.valorCredito;
	}

	public void setValorCredito(java.lang.Integer valorCredito) {
		this.valorCredito = valorCredito;
	}

	public java.lang.Integer getTiempoAmortizacion() {
		return this.tiempoAmortizacion;
	}

	public void setTiempoAmortizacion(java.lang.Integer tiempoAmortizacion) {
		this.tiempoAmortizacion = tiempoAmortizacion;
	}

	public Credito(java.lang.String descripcionCredito,
			java.lang.Integer valorCredito, java.lang.Integer tiempoAmortizacion) {
		this.descripcionCredito = descripcionCredito;
		this.valorCredito = valorCredito;
		this.tiempoAmortizacion = tiempoAmortizacion;
	}

}