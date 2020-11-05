/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

public class DebitoBBFactory {
    public static Remessa getRemessa() {
        return new Remessa();
    }
    
    public static Header getHeader() {
        return new Header();
    }
    
    public static Trailler getTrailler() {
        return new Trailler();
    }
    
    public static RegistroE getRegistroE() {
        return new RegistroE();
    }
    
    public static RegistroF getRegistroF() {
        return new RegistroF();
    }
}
