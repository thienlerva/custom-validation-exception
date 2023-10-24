package com.javatechie.api;

import com.javatechie.api.dto.UserRequest;
import com.javatechie.api.entity.User;
import com.javatechie.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidationExampleApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ValidationExampleApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {

		UserRequest userRequest = UserRequest.build("TomLee", "tomlee@gmail.com", "8883439890", "Male", 19, "USA" );

		User user = User.build(1, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());

		userRepository.save(user);
	}

}
