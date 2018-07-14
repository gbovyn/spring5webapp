package be.gfi.spring5webapp;

import be.gfi.spring5webapp.controllers.GreetingController;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class Spring5WebappApplication {

	public static void main(String[] args) {
		log.info("Init");

		final ConfigurableApplicationContext context = SpringApplication.run(Spring5WebappApplication.class, args);

		log.debug("Listing all available beans");
		log.debug("===========================");
		context.getBeanFactory().getBeanNamesIterator().forEachRemaining(
				log::debug
		);

		val greetingController = (GreetingController) context.getBean("greetingController");

		log.info("Calling 'hello' from greetingController");

		greetingController.hello();

		val newAuthorController = context.getBean(GreetingController.class);

		newAuthorController.hello();
	}
}
