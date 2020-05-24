package test.apple.datingSite.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.apple.datingSite.entities.Users;

@RestController
@RequestMapping("/dating")
public class DatingController {
	
	@RequestMapping("/profiles")
	public List<Users> allUsers(){
		Users u1 = new Users(1L, "UserA", 24, new ArrayList<>());
		Users u2 = new Users(2L, "UserB", 27, new ArrayList<>());
		Users u3 = new Users(3L, "UserC", 29, new ArrayList<>());
		List<Users> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}
