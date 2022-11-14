package UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Ator;

public class Main {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOFlix2");
	private static EntityManager entityManager = emf.createEntityManager();

	public static void main(String[] args) {
		// Ator ator = entityManager.find(Ator.class, 1);
		// System.out.println("nome do Ator:" + ator.getNome());
		System.out.println("Funcionando");
	}

}
