/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

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
