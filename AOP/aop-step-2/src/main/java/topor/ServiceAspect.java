package topor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceAspect {

    @Before("execution(* topor.Service.showMessage(String)) && args(msg)")
    public void checkMethod(String msg){
        System.out.println("Message was caught: \""+msg+"\"");
    }
    
    @After("execution(* topor.Service.*(String[],..))")
    public void checkMainMethod(JoinPoint joinPoint){
        System.out.println("GREAT WORK, COMRAT");
    }
//   
//    @Around("execution(* topor.Service.showMessage(String))")
//    public void testAround() {
//    	System.out.println("checking");
//    }
    
}
