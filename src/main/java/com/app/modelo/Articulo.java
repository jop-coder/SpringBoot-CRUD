package com.app.modelo;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity(name = "ARTICULOS")
public class Articulo implements java.io.Serializable {

	// PROPIEDADES DE CLASE **********************************************
	private static final long serialVersionUID = 7962693553341374010L;
	private int codigoArticulo;
	private String descripcionArticulo;
	private BigDecimal precioUnidadArticulo;
	private Integer cantidad;

	// CONSTRUCTORES *****************************************************
	public Articulo() {
	}

	public Articulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public Articulo(int codigoArticulo, String descripcionArticulo, BigDecimal precioUnidadArticulo, Integer cantidad) {
		this.codigoArticulo = codigoArticulo;
		this.descripcionArticulo = descripcionArticulo;
		this.precioUnidadArticulo = precioUnidadArticulo;
		this.cantidad = cantidad;
	}

	// ACCESORES *********************************************************
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCodigoArticulo() {
		return this.codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	@NonNull
	public String getDescripcionArticulo() {
		return this.descripcionArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	@NonNull
	public BigDecimal getPrecioUnidadArticulo() {
		return this.precioUnidadArticulo;
	}

	public void setPrecioUnidadArticulo(BigDecimal precioUnidadArticulo) {
		this.precioUnidadArticulo = precioUnidadArticulo;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	// OTROS *************************************************************
	
	@Override
	public String toString() {
		return "Articulos [codigoArticulo=" + codigoArticulo + ", descripcionArticulo=" + descripcionArticulo
				+ ", precioUnidadArticulo=" + precioUnidadArticulo + ", cantidad=" + cantidad + "]";
	}

}
