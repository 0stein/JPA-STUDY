package 엔티티매핑;

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
		)}) //테이블 이름 매핑 및 UNIQUE 제약 조건 추가하는 방법.
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userid;
	
	@Column(name = "NAME", nullable = false, length = 10)	//제약 조건 추가.
	private String username;
	
	private Integer age;
	
	@Enumerated(EnumType.STRING)	//enum타입은 이 어노테이션을 사용해야함.
	private RoleType roleType;
	
	
	/**
	 * Date 는 db에서 3가지 타입
	 * date time timeStamp 으로 존재한다.
	 */
	@Temporal(TemporalType.DATE)	
	private Date createdDate;
	
	/**
	 * @Lob 에서는 지정할 수 있는 속성이 없다.
	 * 매핑하는 필드타입이 문자면 
	 * {@link Clob} 으로 나머지는
	 * {@link Blob} 으로 매핑한다.
	 */
	@Lob
	private String description;		//db의 clob타입으로 지정하고 싶을 때 사용한다.

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
