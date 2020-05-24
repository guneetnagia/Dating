package test.apple.datingSite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interests")
public class Interests {
	
	@Id
	@GeneratedValue
	private long interestId;
	private String activity;
	
	public long getInterestId() {
		return interestId;
	}
	public void setInterestId(long interestId) {
		this.interestId = interestId;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public Interests(long interestId, String activity) {
		super();
		this.interestId = interestId;
		this.activity = activity;
	}
	public Interests() {
		super();
	}
	
	
}
