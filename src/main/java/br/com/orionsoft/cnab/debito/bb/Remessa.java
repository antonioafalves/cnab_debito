/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

import br.com.orionsoft.cnab.core.Arquivo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Remessa extends Arquivo {
    private Header header;
    private List<RegistroE> detalhe;
    private Trailler trailler;
    
    public List<RegistroE> getDetalhe() {
        if (detalhe == null)
            detalhe = new ArrayList<>();
        return detalhe;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Trailler getTrailler() {
        return trailler;
    }

    public void setTrailler(Trailler trailler) {
        this.trailler = trailler;
    }

    @Override
    public boolean gravar(PrintWriter writer) throws Exception {
        return super.gravar(writer);
    }
    
}
