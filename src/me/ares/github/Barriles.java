package me.ares.github;

import java.util.Scanner;

public class Barriles {

	public static void main(String[] args) {

		//Se inicialisan los barriles
		Barril[] barriles = { new Barril(8, 8), new Barril(5, 0), new Barril(3, 0) };

		//se crea un scanner
		Scanner input = new Scanner(System.in);

		int movimientos = 0;
		do {

			System.out.println("Movimientos :" + movimientos);

		/*
		 * Se usa un metodo para mover el contenido de los barriles luego de mostrarlo en pantalla
		 */
			for (int i = 0; i < barriles.length; i++) {
				System.out.println("Barril " + (i + 1) + " litros-->" + barriles[i].contenido);
			}
			System.out.println("Barril de origen?");
			int origen = input.nextInt() - 1;
			System.out.println("Barril de destino?");
			int destino = input.nextInt() - 1;

			barriles[destino].llenaDesde(barriles[origen]);

			movimientos++;
		} while (barriles[0].contenido != 4 && barriles[1].contenido != 4);

		System.out.println("Movimientos :" + movimientos);

		
		//Aqui se muestra el contenido de cada barril
		for (int i = 0; i < barriles.length; i++) {
			System.out.println("Barril " + (i + 1) + " litros-->" + barriles[i].contenido);
		}

		input.close();

	}

}
