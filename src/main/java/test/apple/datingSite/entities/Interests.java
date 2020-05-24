package test.apple.datingSite.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	
	
}
