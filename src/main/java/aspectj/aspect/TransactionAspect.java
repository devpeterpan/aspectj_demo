package aspectj.aspect;

import aspectj.annotations.Decorator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TransactionAspect {

    @Pointcut("@annotation(decorator)")
    public void callAt(Decorator decorator) {
    }

    @Around(value = "callAt(decorator)", argNames = "pjp,decorator")
    public Object aroundLog(ProceedingJoinPoint pjp, Decorator decorator) throws Throwable {
        if(!decorator.executeAround()) return pjp.proceed();

        String name = pjp.getSignature().toShortString();
        System.out.println("-- " + name + " around execute start --");
        Object result = pjp.proceed();
        System.out.println("-- " + name + " around execute end --");
        return result;
    }

    @Before(value = "callAt(decorator)", argNames = "decorator")
    public void beforeLog(Decorator decorator) {
        if(decorator.executeBefore()) {
            System.out.println("-- before execute --");
        }
    }

    @After(value = "callAt(decorator)", argNames = "decorator")
    public void afterLog(Decorator decorator) {
        if(decorator.executeAfter()) {
            System.out.println("-- after execute --");
        }
    }

}
