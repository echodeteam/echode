/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echode.api.compiler;

import java.io.StringReader;
import java.util.regex.Pattern;

/**
 *
 * @author Marks
 */
public abstract class LanguageConstruct {
    /**
     * Gets the pattern that will be used for the construct.
     * Response should be in the format of {@code return Pattern.compile(. . .); }
     * @return 
     */
    public abstract Pattern getPattern();
    /**
     * Get a globally unique name for this construct. This will be used  whenever the code refers to it.
     * @return the name
     */
    public abstract String getName();
    /**
     * Gets the {@code StringReader} that will be inserted at the start of the program.
     * This will  be inserted at the start of the program.
     * @return 
     */
    public abstract StringReader getStartReader();
    /**
     *Gets the {@code StringReader} of data to be inserted at the point at which the construct is found.
     * @return the {@code StringReader} of data to be inserted at the point at which the construct is found.
     */
    public abstract StringReader getInsPointReader();

    /**
     * Gets the {@code StringReader} of data to be inserted at the end of the code.
     * @return the {@code StringReader} of data to be inserted at the end of the code.
     */
    public abstract StringReader getFinalReader();
}
