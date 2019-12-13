package testeGestor;

import controller.GestorController;
import entity.Gestor;

public class teste {

	public static void main(String[] args) {
		
		Gestor gestor1 = new Gestor();
		
		gestor1.setNome("Rodrigues");
		gestor1.setMatricula("193303");
		gestor1.setData_Nascimento(28);
		gestor1.setSetor("Administrativo");
		
		
	Gestor gestor2 = new Gestor();
		
	gestor2.setNome("João");
	gestor2.setMatricula("293314");
	gestor2.setData_Nascimento(28);
	gestor2.setSetor("Tecnologia");
		
	Gestor gestor3 = new Gestor();
		
	gestor3.setNome("Rodrigues");
	gestor3.setMatricula("393325");
	gestor3.setData_Nascimento(28);
	gestor3.setSetor("Recursos humanos");
		
	Gestor gestor4 = new Gestor();
		
	gestor4.setNome("Rodrigues");
	gestor4.setMatricula("493336");
	gestor4.setData_Nascimento(28);
	gestor4.setSetor("Suporte técnico");
		
		GestorController  con = new GestorController();
		con.salvarGestor(gestor1);
//		con.salvarGestor(gestor2);
//		con.salvarGestor(gestor3);
//		con.salvarGestor(gestor4);

	}

}
