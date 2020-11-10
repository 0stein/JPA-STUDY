package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ��ƼƼ����.Logic��ƼƼ����;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Logic logic = new Logic��ƼƼ����(em);
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
