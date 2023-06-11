package mvc.helper;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//instead of writting one by one package name({"controller","dao","dto","helper","services"}) create pakage name mvc.controller,mvc.dao
@ComponentScan("mvc")
public class MyConfiguration 
{
	@Bean
	public EntityManager getEM()
	{
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	
//	@Bean
//	public ViewResolver getVR()
//	{
//		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
//		resolver.setSuffix(".jsp");
//		resolver.setPrefix("/jspfiles");
//		return resolver;
//	}

}
