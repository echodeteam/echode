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
    public boolean hasSubexps() {
        return false;
    }
    /**
     * Evaluate other expressions required for the construct.
     * @param line 
     */
    public abstract void evalSubexps(String line) throws MissingSubexpDataException;
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
    public abstract StringReader getFinalReader();
}
