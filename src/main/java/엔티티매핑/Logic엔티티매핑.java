package 엔티티매핑;

import java.util.Date;

import javax.persistence.EntityManager;

import sample.Logic;

public class Logic엔티티매핑 implements Logic{
	private EntityManager entityManager;
	
	public void run() {
		Member member = new Member("aad3365","Park",17,RoleType.CLIENT,
				new Date(),"description");
		entityManager.persist(member);
	}

	public Logic엔티티매핑(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
