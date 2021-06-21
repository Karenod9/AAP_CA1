/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protect;

/**
 *
 * @author x20144148
 */
public class FileException extends Exception {
    public FileException (String errorMessage) {
		super("File Error : " + errorMessage);
    }    
}
