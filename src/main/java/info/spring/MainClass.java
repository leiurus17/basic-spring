package info.spring;

import info.spring.api.Logger;
import info.spring.api.UsersRepository;
import info.spring.domain.User;
import info.spring.implementation.LoggerImpl;
import info.spring.implementation.UsersRepositoryImpl;

public class MainClass {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);

		User user = usersRepository.createUser("John");
	}
}
