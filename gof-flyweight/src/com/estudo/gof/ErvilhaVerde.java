package com.estudo.gof;

public class ErvilhaVerde extends ErvilhaCombinada {
	public ErvilhaVerde(Ervilha ervilhaPai) {
		super(ervilhaPai);
	}

	public ErvilhaVerde() {
		super(null);
	}

	public void combinar() {
		super.combinar();
		mostrarCor();
	}

	private void mostrarCor() {
		System.out.print("Ervilha Verde");
	}
}
