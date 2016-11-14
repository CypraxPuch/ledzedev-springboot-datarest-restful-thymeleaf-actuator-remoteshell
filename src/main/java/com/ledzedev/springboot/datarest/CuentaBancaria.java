package com.ledzedev.springboot.datarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 14/Nov/2016.
 */
@Entity
class CuentaBancaria {

	@Id
	@GeneratedValue
	private Long id;

	private String titularCuenta;

	private String saldoDisponible;

	public CuentaBancaria(String titularCuenta, String saldoDisponible) {
		this.titularCuenta = titularCuenta;
		this.saldoDisponible = saldoDisponible;
	}

	public CuentaBancaria() {//JPA requiere constructor vacío y nadie sabe por que???
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitularCuenta() {
		return titularCuenta;
	}

	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}

	public String getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(String saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	@Override
	public String toString() {
		return "CuentaBancaria{" +
				"id=" + id +
				", titularCuenta='" + titularCuenta + '\'' +
				", saldoDisponible=" + saldoDisponible +
				'}';
	}
}
