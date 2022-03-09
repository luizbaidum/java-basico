import br.dio.dp.strategy.*;

public class Executar {
	
	public static void main(String[] args) {
	
	iComportamento normal = new ComportamentoNormal();
	
	iComportamento defensivo = new ComportamentoDefensivo();
	
	iComportamento agressivo = new ComportamentoAgressivo();
	
	Robo robo = new Robo();
	
	robo.setComportamento(defensivo);
	
	robo.mover();
	
robo.setComportamento(normal);
	
	robo.mover();
	
	}
}
