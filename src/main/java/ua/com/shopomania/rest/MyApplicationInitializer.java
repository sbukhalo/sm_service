package ua.com.shopomania.rest;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyApplicationInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) {
    	AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
    	appContext.register(WebConfig.class);
    	servletContext.addListener(new ContextLoaderListener(appContext));
    	appContext.setServletContext(servletContext);
        
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}