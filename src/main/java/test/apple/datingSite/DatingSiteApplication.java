package test.apple.datingSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="test.apple.datingSite.repository")
@SpringBootApplication
public class DatingSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatingSiteApplication.class, args);
	}

}
