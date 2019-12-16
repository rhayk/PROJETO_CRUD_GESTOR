package controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.jdbc.PreparedStatement;

import entity.Gestor;

public class GestorController {

	EntityManagerFactory emf; // Um EntityManager mapea um conjunto de classes a um banco de dados particular.
								// Este conjunto de classes � chamado de persistence unit (unidade de
								// persist�ncia).
	EntityManager em; // o "em" ser� utilizado para criar as opera��es.

	public GestorController() {
		emf = Persistence.createEntityManagerFactory("gestor"); // nome que foi criado em persistence
		em = emf.createEntityManager();
	}

	public void salvarGestor(Gestor _gestor) {
		em.getTransaction().begin(); // precisamos iniciar e comitar uma transa��o antes e depois de chamar um m�todo
										// operacional. Em ambos os casos devemos chamar getTransaction() no Entity
										// Manager para receber um EntityTransaction e ent�o invocamos begin(). Para
										// comitar a transa��o usamos commit() no EntityTransaction.
		em.merge(_gestor); // O merge() recebe um objeto "comum", que n�o est� no contexto de persist�ncia,
		em.getTransaction().commit();					// e copia as propriedades deste objeto para a verdadeira inst�ncia da entidade
		emf.close();
	}
	
	public void alterar() {
		em.getTransaction().begin();
		Query update = em.createNamedQuery("UPDATE gestor SET gestor where gestor");
		update.executeUpdate();          // nome tabela / dados atualizadoss/ dados escolhidos
		em.getTransaction().commit();
		emf.close();
	
	
	}
	

	public void removerGestor(Gestor _gestor) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete gestor from gestor where matricula = " + _gestor.getMatricula());
		q.executeUpdate();
		em.getTransaction().commit();	
		emf.close();

	}
	
	public List<Gestor> listar(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT gestor FROM Gestor gestor"); //retornar todos os alunos em forma de objetos
		List<Gestor> lista = consulta.getResultList(); // atribuir a lista
		emf.close();
		return lista;
	}

}
