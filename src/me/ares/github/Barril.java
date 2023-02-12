package me.ares.github;

public class Barril {

	int capacidad;
	int contenido;

	
	//Constructor de barril
	Barril(int cap, int cont) {
		capacidad = cap;
		contenido = cont;
	}

	//Metodo usado para mover el contenido de los barriles
	void llenaDesde(Barril origen) {
		int cantidad = origen.contenido;
		int libre = this.capacidad - this.contenido;

		int mover;
		if (cantidad < libre)
			mover = cantidad;
		else
			mover = libre;

		origen.contenido = origen.contenido - mover;
		this.contenido = this.contenido + mover;

	}
}