package ��ƼƼ����;

import java.util.Date;

import javax.persistence.EntityManager;

import sample.Logic;

public class Logic��ƼƼ���� implements Logic{
	private EntityManager entityManager;
	
	public void run() {
		Member member = new Member("aad3365","Park",17,RoleType.CLIENT,
				new Date(),"description");
		entityManager.persist(member);
	}

	public Logic��ƼƼ����(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
