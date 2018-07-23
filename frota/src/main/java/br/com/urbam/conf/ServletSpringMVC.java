package br.com.urbam.conf;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
		//return new Class[] {};
	} // SecurityConfiguration.class,JPAConfiguration.class

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppWebConfiguration.class};
		//, JPAConfiguration.class , AppWebConfiguration.class
		//return null;
		//ResourcesConfig.class,
    }
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"} ;
	}	
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		super.customizeRegistration(registration);
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}

	/*@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		super.onStartup(servletContext);
		servletContext.addListener(RequestContextListener.class);
		servletContext.setInitParameter(
				AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "dev");

	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new OpenEntityManagerInViewFilter() };
	}*/
}
