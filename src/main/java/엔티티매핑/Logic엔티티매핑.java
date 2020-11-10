package 엔티티매핑;

import java.util.Date;

import javax.persistence.EntityManager;

import sample.Logic;

public class Logic엔티티매핑 implements Logic{
	private EntityManager entityManager;
	
	public void run() {
		Member member = 
				new Member(10526L,"Park",17,RoleType.CLIENT,
				new Date(),"description");
		entityManager.persist(member);
		//영속화 하기
	}

	public Logic엔티티매핑(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
