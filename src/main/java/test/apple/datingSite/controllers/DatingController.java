package test.apple.datingSite.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.apple.datingSite.entities.Users;
import test.apple.datingSite.repository.DatingRepository;

@RestController
@RequestMapping("/dating")
public class DatingController {
	
	@Autowired
	private DatingRepository datingRepo;
	
	@RequestMapping(value="/profiles",method=RequestMethod.GET)
	public List<Users> allUsers(){
		Users u1 = new Users(1L, "UserA", 24, new ArrayList<>());
		Users u2 = new Users(2L, "UserB", 27, new ArrayList<>());
		Users u3 = new Users(3L, "UserC", 29, new ArrayList<>());
		List<Users> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return datingRepo.findAll();
	}
	
	@GetMapping(value="/profiles/{name}")
	public Users findByName(@PathVariable String name){
		return datingRepo.findByName(name);
	}
	
	@PostMapping(value="/profiles/load")
	public Users loadUsers(@RequestBody Users user){
		datingRepo.save(user);
		return datingRepo.findByName(user.getName());
	}
}
