package aspectj.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Decorator {
    boolean executeAround() default false;
    boolean executeBefore() default false;
    boolean executeAfter() default false;
}
