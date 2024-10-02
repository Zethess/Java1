package com.curso.modelos;


public abstract class Vehiculo {

	protected final String matricula;
	protected double espacioRecorrido;
	protected double tiempoViaje;
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public double getEspacioRecorrido() {
		return espacioRecorrido;
	}
	public void setEspacioRecorrido(double espacioRecorrido) {
		this.espacioRecorrido = espacioRecorrido;
	}
	public double getTiempoViaje() {
		return tiempoViaje;
	}
	public void setTiempoViaje(double tiempoViaje) {
		this.tiempoViaje = tiempoViaje;
	}
	
}
