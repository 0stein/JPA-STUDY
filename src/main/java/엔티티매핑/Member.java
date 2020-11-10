package 엔티티매핑;

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
@Table(name = "MEMBER") //테이블 이름 매핑
public class Member {
	@Id
	@Column(name = "USER_ID")
	private String userid;
	
	@Column(name = "NAME", nullable = false, length = 10)	//제약 조건 추가.
	private String username;
	
	private Integer age;
	
	@Enumerated(EnumType.STRING)	//enum타입은 이 어노테이션을 사용해야함.
	private RoleType roleType;
	
	@Temporal(TemporalType.TIMESTAMP)	//날짜 타입은 이 어노테이션을 사용해야함.
	private Date createdDate;
	
	@Lob
	private String description;		//db의 clob타입으로 지정하고 싶을 때 사용한다.

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
