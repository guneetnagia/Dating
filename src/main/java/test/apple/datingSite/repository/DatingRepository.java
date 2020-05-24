package test.apple.datingSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import test.apple.datingSite.entities.Users;

@Component
public interface DatingRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);
}
