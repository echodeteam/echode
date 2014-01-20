/*
 * Echode
 *     Copyright (C) 2014  Echode Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
