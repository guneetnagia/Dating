package test.apple.datingSite.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import test.apple.datingSite.entity.Profiles;

public class DatingDao {

	//Profiles client = new Profiles();
	
	public List<Profiles> matchDating(Profiles client){
		
		Profiles user1 = new Profiles(Long.parseLong("1"), "UserA", 25, "FEMALE", new ArrayList<String>() {{add("CRICKET");}}, 0);
		Profiles user2 = new Profiles(Long.parseLong("2"), "UserB", 27, "MALE", new ArrayList<String>() {{add("CRICKET");add("FOOTBALL");add("MOVIES");}}, 0);
		Profiles user3 = new Profiles(Long.parseLong("3"), "UserC", 26, "MALE", new ArrayList<String>() {{add("TENNIS");add("FOOTBALL");add("MOVIES");}}, 0);
		Profiles user4 = new Profiles(Long.parseLong("4"), "UserD", 24, "FEMALE", new ArrayList<String>() {{add("TENNIS");add("FOOTBALL");add("BADMINTON");}}, 0);
		Profiles user5 = new Profiles(Long.parseLong("5"), "UserE", 32, "FEMALE", new ArrayList<String>() {{add("CRICKET");add("FOOTBALL");add("MOVIES");add("BADMINTON");}}, 0);
		
		List<Profiles> matching = new ArrayList<Profiles>() {{add(user1);add(user2);add(user3);add(user4);add(user5);}};
		
		
		Collections.sort(matching, new Comparator<Profiles>() {

			@Override
			public int compare(Profiles o1, Profiles o2) {
				// TODO Auto-generated method stub
				return Math.abs(o1.getAge() - client.getAge());
			}
		});
		
		List<String> cinterst = client.getInterest();
		for(Profiles p : matching){
			int score = 0;
			if(!client.getGender().equalsIgnoreCase(p.getGender())){
				List<String> interst = p.getInterest();
				
				for(int j = 0;j<(interst.size() < cinterst.size() ? interst.size() : cinterst.size()); j++){
					
					if(interst.get(j).equals(cinterst.get(j))){
						score++;
					}
				}
				p.setScore(score +  5-Math.abs(client.getAge()-p.getAge()));
			}
			
		}
					
		
		
		//sort by score
		Collections.sort(matching,new Comparator<Profiles>(){
			@Override
			public int compare(Profiles a, Profiles b) {
				return a.getScore() - b.getScore();
			}
		});
		
				
		System.out.println(matching);
		
		return matching;
	}

	
}
