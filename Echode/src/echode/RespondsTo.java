package echode;

import java.lang.annotation.*;
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/**
 * Should be on the run method of echode.programs.
 * @author Marks
 *
 */
public @interface RespondsTo {
	String command();
}
