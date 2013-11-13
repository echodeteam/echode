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
