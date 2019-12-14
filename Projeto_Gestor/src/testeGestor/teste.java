package testeGestor;

import java.util.List;

import controller.GestorController;
import entity.Gestor;

public class teste {

	public static void main(String[] args) {

		Gestor gestor1 = new Gestor();

		gestor1.setNome("Rodrigues");
		gestor1.setMatricula("193303");
		gestor1.setData_Nascimento(25);
		gestor1.setSetor("Administrativo");

		Gestor gestor2 = new Gestor();

		gestor2.setNome("Matheus");
		gestor2.setMatricula("293314");
		gestor2.setData_Nascimento(28-12-1998);
		gestor2.setSetor("Tecnologia");

		Gestor gestor3 = new Gestor();

		gestor3.setNome("Pedro");
		gestor3.setMatricula("393325");
		gestor3.setData_Nascimento(21-9-1994);
		gestor3.setSetor("Recursos humanos");

		Gestor gestor4 = new Gestor();

		gestor4.setNome("Daniel");
		gestor4.setMatricula("493336");
		gestor4.setData_Nascimento(30-7-1990);
		gestor4.setSetor("Suporte técnico");
		
		Gestor gestor5 = new Gestor();
		gestor5.setNome("Raphael");
		gestor5.setMatricula("242424");
		gestor5.setData_Nascimento(23-3-1992);
		gestor5.setSetor("Advogado");

		GestorController gestor = new GestorController();
//		gestor.salvarGestor(gestor1);
//		gestor.salvarGestor(gestor2);
//		gestor.salvarGestor(gestor3);
//		gestor.salvarGestor(gestor4);
		
		gestor.removerGestor(gestor1);
		gestor.removerGestor(gestor2);
		gestor.removerGestor(gestor3);
		gestor.removerGestor(gestor4);
		
		List<Gestor> gestores = gestor.listar();

		for (int i = 0; i < gestores.size(); i++) {

			System.out.println("Nome: " + gestores.get(i).getNome() + ", Matricula: " + gestores.get(i).getMatricula()
					+ ", Data de Nascimento: " + gestores.get(i).getSetor());

		}

	}
}
