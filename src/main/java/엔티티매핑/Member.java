package ��ƼƼ����;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
		name = "NAME_AGE_UNIQUE",
		columnNames = {"NAME","AGE"}
		)}) //���̺� �̸� ���� �� UNIQUE ���� ���� �߰��ϴ� ���.
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userid;
	
	@Column(name = "NAME", nullable = false, length = 10)	//���� ���� �߰�.
	private String username;
	
	private Integer age;
	
	@Enumerated(EnumType.STRING)	//enumŸ���� �� ������̼��� ����ؾ���.
	private RoleType roleType;
	
	
	/**
	 * Date �� db���� 3���� Ÿ��
	 * date time timeStamp ���� �����Ѵ�.
	 */
	@Temporal(TemporalType.DATE)	
	private Date createdDate;
	
	/**
	 * @Lob ������ ������ �� �ִ� �Ӽ��� ����.
	 * �����ϴ� �ʵ�Ÿ���� ���ڸ� 
	 * {@link Clob} ���� ��������
	 * {@link Blob} ���� �����Ѵ�.
	 */
	@Lob
	private String description;		//db�� clobŸ������ �����ϰ� ���� �� ����Ѵ�.

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
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

	public Member(Long userid, String username, Integer age, RoleType roleType, Date createdDate,
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
