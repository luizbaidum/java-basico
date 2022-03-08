import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Executar {
	
	public static void main(String [] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("GFT Java #4");
		curso1.setCargaHoraria(56);
		
		//System.out.println(curso1);
		
		//--//
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Aprenda Java");
		mentoria1.setData(LocalDate.now());
		
		//System.out.println(mentoria1);
		
		//--//
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Aprenda Java!");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		//--//
		Dev devLuiz = new Dev();
		devLuiz.setNome("Luiz");
		devLuiz.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteúdos inscritos de Luiz: " + devLuiz.getConteudosInscritos());
		
		devLuiz.progredir();
		
		System.out.println("Conteúdos concluídos de Luiz: " + devLuiz.getConteudosConcluidos());
		System.out.println("Conteúdos inscritos de Luiz: " + devLuiz.getConteudosInscritos());
		System.out.println("XP: " + devLuiz.calcularTotalXp());
	
	}

}
