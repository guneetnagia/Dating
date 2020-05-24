package test.apple.datingSite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.apple.datingSite.dao.DatingDao;
import test.apple.datingSite.entity.Profiles;

@RestController
@RequestMapping("/dating")
public class DatingController {
	
	@Autowired
	private DatingDao datingDao;
	
	@RequestMapping("/matchDate/{profile}")
	public List<Profiles> matchDate(@PathVariable Profiles profile){
		return datingDao.matchDating(profile);
	}
}
