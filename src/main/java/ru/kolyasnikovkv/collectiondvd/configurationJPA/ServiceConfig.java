package ru.kolyasnikovkv.collectiondvd.configurationJPA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
@ComponentScan({ "ru.kolyasnikovkv.collectiondvd" })
public class ServiceConfig {
	
	/**
	 * http://docs.spring.io/autorepo/docs/spring/4.2.5.RELEASE/spring-framework-reference/html/beans.html
	 * 
	 * Also, be particularly careful with BeanPostProcessor and BeanFactoryPostProcessor definitions via @Bean. 
	 * Those should usually be declared as static @Bean methods, not triggering the instantiation of their containing configuration class. 
	 * Otherwise, @Autowired and @Value won't work on the configuration class itself since it is being created as a bean instance too early.
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() throws IOException{
		PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
		conf.setLocations(new ClassPathResource("application.properties"));
		return conf;
	}
}
