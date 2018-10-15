

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AccountAspect {

    @Before("execution(* Account.*(..))")
    public void checkMethod(JoinPoint joinPoint){
        System.out.println("it is working!!!");
    }
   
    
}
