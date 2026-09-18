package tw.brad.hibernate.tutor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tw.brad.hibernate.entity.Account;

public class Brad02 {

	public static void main(String[] args) {
		try (EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("brad");
			EntityManager em = emf.createEntityManager();) {
//			System.out.println("OK");
			em.getTransaction().begin();

			Account account = new Account();
			account.setName("mike");
			account.setEmail("mike@brad.tw");

			em.persist(account);

			em.getTransaction().commit();

		}
	}

}
