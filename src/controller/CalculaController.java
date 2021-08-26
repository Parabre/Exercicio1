package controller;

public class CalculaController {

	public CalculaController() {
		super();
	}
	
	public int calc(int numero){
		System.out.println(numero);
		if(numero == 0) {
			return 0;
		}else{
			return numero + calc(numero -1);
		}
	}

}
