package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
							// e copia as propriedades deste objeto para a verdadeira inst�ncia da entidade
		em.getTransaction();
		emf.close();
	}

	public void removerGestor(Gestor _gestor) {
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete gestor from gestor where matricula = " + _gestor.getMatricula());
		em.getTransaction();
		emf.close();

	}

}