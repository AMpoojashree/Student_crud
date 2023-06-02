package mvc.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    Class[] arr={MyConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr={"/"};
		return arr ;
	}

}
