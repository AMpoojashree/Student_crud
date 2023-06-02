package mvc.helper;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mvc")
//instead of writting one by one package name({"controller","dao","dto","helper","services"}) create pakage name mvc.controller,mvc.dao
public class MyConfiguration 
{

}
