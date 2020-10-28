
  package com.web.service.config;
  
  import javax.servlet.ServletContext; import javax.servlet.ServletException;
  import javax.servlet.ServletRegistration;
  
  import org.apache.cxf.transport.servlet.CXFServlet; import
  org.springframework.web.WebApplicationInitializer; import
  org.springframework.web.context.ContextLoaderListener; import
  org.springframework.web.context.support.
  AnnotationConfigWebApplicationContext;
  
  public class CxfServletInitializer implements WebApplicationInitializer {
  
  @Override public void onStartup(ServletContext servletContext) throws
  ServletException {
  
  AnnotationConfigWebApplicationContext context = new
  AnnotationConfigWebApplicationContext();
  context.register(ServiceConfiguration.class);
  servletContext.addListener(new ContextLoaderListener(context));
  
  ServletRegistration.Dynamic dispatcher =
  servletContext.addServlet("dispatcher", new CXFServlet());
  dispatcher.addMapping("/services/*");
  
  }
  
  }
 