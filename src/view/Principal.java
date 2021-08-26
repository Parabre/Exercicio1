package view;

import controller.CalculaController;

public class Principal {

	public static void main(String[] args) {
		CalculaController calculaController = new CalculaController();
		int numero = 5;
		int calc = calculaController.calc(numero);
		System.out.println(calc);
	}

}
