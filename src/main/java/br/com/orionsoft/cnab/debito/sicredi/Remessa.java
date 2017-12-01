/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.Arquivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class Remessa extends Arquivo {
    private Header header;
    private List<RegistroE> registroE;
    private Trailer trailer;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<RegistroE> getRegistroE() {
        if (registroE == null) {
            registroE = new ArrayList<>();
        }
        return registroE;
    }

    public void addRegistroE(RegistroE e) {
        if (registroE == null) {
            registroE = new ArrayList<>();
        }
        registroE.add(e);
    }
    
    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

}
