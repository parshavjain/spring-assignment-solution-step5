package com.stackroute.activitystream.config;

/*This class will contain the application-context for the application. 
 * Define the following annotations:
 * @Configuration - Annotating a class with the @Configuration indicates that the 
 *                  class can be used by the Spring IoC container as a source of 
 *                  bean definitions
 * @ComponentScan - this annotation is used to search for the Spring components amongst the application
 * @EnableTransactionManagement - Enables Spring's annotation-driven transaction management capability.
 * @EnableAspectJAutoProxy - This spring aop annotation is used to enable @AspectJ support with Java @Configuration                
 * 
 * */

public class ApplicationContextConfig {

	/*
	 * With the @AspectJ support enabled, any bean defined in your application context 
	 * with a class that is an @AspectJ aspect (has the @Aspect annotation) will be 
	 * automatically detected by Spring and used to configure Spring AOP. Hence, Define 
	 * the bean for the LoggingAspect class.
	 * */

}
