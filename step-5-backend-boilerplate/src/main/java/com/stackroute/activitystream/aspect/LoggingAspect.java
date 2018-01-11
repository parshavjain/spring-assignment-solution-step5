package com.stackroute.activitystream.aspect;

import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	//User DAO logs
	@Before("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.validate(..))")
	public void logBeforeValidateUser(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.validate(..))")
	public void logAfterValidateUser(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.validate(..))", returning = "result")
	public void logAfterReturningValidateUser(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.validate(..))", throwing = "error")
	public void logAfterThrowingValidateUser(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
	@Before("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.save(..))")
	public void logBeforeSave(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.save(..))")
	public void logAfterSave(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.save(..))", returning = "result")
	public void logAfterReturningSave(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.save(..))", throwing = "error")
	public void logAfterThrowingSave(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
	@Before("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.delete(..))")
	public void logBeforeDelete(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.delete(..))")
	public void logAfterDelete(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.delete(..))", returning = "result")
	public void logAfterReturningDelete(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.UserServiceImpl.delete(..))", throwing = "error")
	public void logAfterThrowingDelete(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
	//Message DAO logs
	@Before("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromCircle(..))")
	public void logBeforeGetMessagesFromCircle(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromCircle(..))")
	public void logAfterGetMessagesFromCircle(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromCircle(..))", returning = "result")
	public void logAfterReturningGetMessagesFromCircle(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromCircle(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromCircle(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
	@Before("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromUser(..))")
	public void logBeforeGetMessagesFromUser(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromUser(..))")
	public void logAfterGetMessagesFromUser(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromUser(..))", returning = "result")
	public void logAfterReturningGetMessagesFromUser(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.getMessagesFromUser(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromUser(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
	@Before("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.subscribeUserToTag(..))")
	public void logBeforesubscribeUserToTag(JoinPoint joinPoint) {
	    logger.info("============@Before==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("*********************************");
	}
	@After("execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.subscribeUserToTag(..))")
	public void logAftersubscribeUserToTag(JoinPoint joinPoint) {
	    logger.info("============@After==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.subscribeUserToTag(..))", returning = "result")
	public void logAfterReturningsubscribeUserToTag(JoinPoint joinPoint, Object result) {
	    logger.debug("============@AfterReturning==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("*********************************");
	}
	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.serviceimpl.MessageServiceImpl.subscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingsubscribeUserToTag(JoinPoint joinPoint, Throwable error) {
	    logger.info("============@AfterThrowing==========");
	    logger.debug("Method Name : " + joinPoint.getSignature().getName());
	    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	    logger.debug("Exception : " + error);
	    logger.debug("*********************************");
	}
}
