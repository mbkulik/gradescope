import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Rubric {
    String description() default "";
    int points() default 0;
    // Controlling test case visibility 
    //https://gradescope-autograders.readthedocs.io/en/latest/specs/#controlling-test-case-visibility
    String visibility() default "visible";
    String stdout_visibility() default "visible"; // default output visibility
}
