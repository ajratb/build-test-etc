package topor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceAspect {

    @Before("execution(* Service.*(..))")
    public void checkMethod(JoinPoint joinPoint){
        System.out.println("it is working!!!");
    }
   
    
}
