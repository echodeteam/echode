/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echode.api.echodec;

import java.util.regex.Pattern;

/**
 *
 * @author Marks
 */
public enum LanguageConstruct {
    LINE_TERMINATION(Pattern.compile("(?i)."));
    private final Pattern pattern;
    LanguageConstruct(Pattern pattern) {
    this.pattern = pattern;
}

    /**
     * @return the pattern
     */
    public Pattern getPattern() {
        return pattern;
    }
}
