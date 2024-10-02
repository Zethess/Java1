package com.curso.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.curso.interfaces.IConducible;

public class Coche extends Vehiculo implements IConducible{
	private String color;
	private static final int NUMERO_RUEDAS = 4;
	private LocalDateTime tiempoInicio;
	
	public Coche(String matricula, String color) {
		super(matricula);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public static int getNumeroRuedas() {
		return NUMERO_RUEDAS;
	}
	@Override
	public void conducir() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		 this.tiempoInicio = LocalDateTime.now();
	     System.out.println("Viaje iniciado a las: " + tiempoInicio.format(formatter));
	}
	@Override
	public void avanzar(double distancia) {
		if(this.tiempoInicio == null) {
			System.out.println("Si no se inicia el viaje, el coche no puede avanzar");
			return;
		}
		espacioRecorrido += distancia;
		System.out.println("El coche avanzó " + distancia + " metros");
	}
	@Override
	public void retroceder(double distancia) {
		if(this.tiempoInicio == null) {
			System.out.println("Si no se inicia el viaje, el coche no puede retroceder");
			return;
		}
		espacioRecorrido -= distancia;
		System.out.println("El coche retrocedió " + distancia + " metros");
	}
	@Override
	public void parar() {
		if(this.tiempoInicio == null) {
			System.out.println("Si no se inicia el viaje, el coche no puede parar");
			return;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		System.out.println("Viaje terminado a las " + LocalDateTime.now().format(formatter));
		tiempoInicio = null;	
	}
	@Override
	public String toString() {
		return "Coche [color=" + color + "]";
	}
	
	
}
