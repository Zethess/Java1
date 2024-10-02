package com.curso.principal;

import com.curso.modelos.Coche;

public class Test {

	public static void main(String[] args) {
		Coche miCoche = new Coche("ABC123", "Rojo");
		System.out.println(miCoche);
        miCoche.conducir();
        miCoche.avanzar(100);
        miCoche.parar();

	}

}
