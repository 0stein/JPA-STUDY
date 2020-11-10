package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import 엔티티매핑.Logic엔티티매핑;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Logic logic = new Logic엔티티매핑(em);
		LogicLoader logicLoader = new LogicLoader(logic);
		
		try {
			tx.begin();
			logicLoader.run();
			tx.commit();
		}catch (Exception e){
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();
	}
	
	
}
