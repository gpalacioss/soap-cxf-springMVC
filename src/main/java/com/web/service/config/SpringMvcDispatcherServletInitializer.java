/*
 * package com.web.service.config;
 * 
 * import org.springframework.web.servlet.support.
 * AbstractAnnotationConfigDispatcherServletInitializer;
 * 
 * public class SpringMvcDispatcherServletInitializer extends
 * AbstractAnnotationConfigDispatcherServletInitializer {
 * 
 * @Override protected Class<?>[] getRootConfigClasses() {
 * 
 * return null; }
 * 
 * @Override protected Class<?>[] getServletConfigClasses() { return new Class[]
 * { ApplicationConfig.class }; }
 * 
 * @Override protected String[] getServletMappings() { return new String[] { "/"
 * }; }
 * 
 * 
 * 
 * @Bean public ServletRegistrationBea cxfServlet() { ServletRegistrationBean
 * servlet = new ServletRegistrationBean(new CXFServlet(), "/services/*");
 * servlet.setLoadOnStartup(1); return servlet; }
 * 
 * 
 * }
 */