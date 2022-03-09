package br.dio.dp.strategy;

public class ComportamentoAgressivo implements iComportamento {

	@Override
	public void mover() {
		
		System.out.println("O Robo está movendo-se agressivamente...");
		
	}

}
