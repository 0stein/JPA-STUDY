package ��ƼƼ����;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Table(name = "MEMBER") //���̺� �̸� ����
public class Member {
	@Id
	@Column(name = "USER_ID")
	private String userid;
	
	@Column(name = "NAME", nullable = false, length = 10)	//���� ���� �߰�.
	private String username;
	
	private Integer age;
	
	@Enumerated(EnumType.STRING)	//enumŸ���� �� ������̼��� ����ؾ���.
	private RoleType roleType;
	
	@Temporal(TemporalType.TIMESTAMP)	//��¥ Ÿ���� �� ������̼��� ����ؾ���.
	private Date createdDate;
	
	@Lob
	private String description;		//db�� clobŸ������ �����ϰ� ���� �� ����Ѵ�.

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Member(String userid, String username, Integer age, RoleType roleType, Date createdDate,
			String description) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.roleType = roleType;
		this.createdDate = createdDate;
		this.description = description;
	}

	public Member() {
		super();
	}
}
