package me.ares.github;

import java.util.Scanner;

public class Barriles {

	public static void main(String[] args) {

		Barril[] barriles = { new Barril(8, 8), new Barril(5, 0), new Barril(3, 0) };

		Scanner input = new Scanner(System.in);

		int movimientos = 0;
		do {

			System.out.println("Movimientos :" + movimientos);

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

		for (int i = 0; i < barriles.length; i++) {
			System.out.println("Barril " + (i + 1) + " litros-->" + barriles[i].contenido);
		}

		input.close();

	}

}
