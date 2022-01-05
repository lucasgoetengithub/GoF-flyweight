package com.estudo.gof;

public class FlyW {
	public static void main(String[] args) {
		combinar();
	}

	public static void combinar() {
		ErvilhaFlyWeight fly = new ErvilhaFlyWeight();
		fly.mostrar(new ErvilhaVerde());
		fly.mostrar(new ErvilhaVermelha());
		fly.mostrar(new ErvilhaAmarela());
	}
}