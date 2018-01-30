package info.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import info.spring.api.UsersRepository;
import info.spring.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		UsersRepository usersRepository = context.getBean("repositoryUsers", UsersRepository.class);

		User user = usersRepository.createUser("Michael");
	}
}
