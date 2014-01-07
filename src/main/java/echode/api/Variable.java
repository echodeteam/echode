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
package echode.api;

/**
 *
 * @author Marks
 */
public class Variable {
    // T stands for "Type"
    private Object t;

    public void set(Object t) { this.t = t; }
    public Object get() { return t; }
    public Class getType() { return t.getClass(); }
    public Variable(Object initial) {t = initial;}
            
    
}
