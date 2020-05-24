package test.apple.datingSite.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dating_Profiles")
public class Users {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long userId;
	@Column(name="user_name")
	private String name;
	@Column(name="user_age")
	private int age;
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
		)
	private List<Interests> interests;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Interests> getInterests() {
		return interests;
	}
	public void setInterests(List<Interests> interests) {
		this.interests = interests;
	}
	
	public Users(Long userId, String name, int age, List<Interests> interests) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.interests = interests;
	}
	public Users() {
		super();
	}
	
	
}
