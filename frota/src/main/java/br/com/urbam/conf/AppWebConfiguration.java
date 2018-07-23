package br.com.urbam.conf;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.urbam.controllers.HomeController;
import br.com.urbam.dao.ProductDAO;


@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class,ProductDAO.class})

@EnableCaching
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver() { 
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");		
		return resolver;
	}
	
	//Formato de Data
	/*public FormattingConversionService mvcConversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService(
				true);

		DateFormatterRegistrar registrar = new DateFormatterRegistrar();
		registrar.setFormatter(new DateFormatter("yyyy-MM-dd"));
		registrar.registerFormatters(conversionService);
		return conversionService;
	}

	private FormatterRegistry conversionService(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
