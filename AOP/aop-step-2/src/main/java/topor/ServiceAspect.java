package topor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceAspect {

    @Before("execution(* topor.Service.showMessage(String)) && args(msg)")
    public void checkMethod(String msg){
        System.out.println("it is working!!!"+msg);
    }
    
    @After("execution(* topor.Service.*(String[],..))")
    public void checkMainMethod(JoinPoint joinPoint){
        System.out.println("it is second method!!!");
    }
   
    
}
