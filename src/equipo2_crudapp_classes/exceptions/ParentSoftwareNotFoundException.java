/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.exceptions;

/**
 *
 * @author iker lopez carrillo
 */
public class ParentSoftwareNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ParentSoftwareNotFoundException</code>
     * without detail message.
     */
    public ParentSoftwareNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ParentSoftwareNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParentSoftwareNotFoundException(String msg) {
        super(msg);
    }
}
