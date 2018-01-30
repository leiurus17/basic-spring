package info.spring.implementation;

import info.spring.api.Logger;
import info.spring.api.UsersRepository;
import info.spring.domain.User;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public User createUser(String name) {
		logger.log("Create user -> " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
