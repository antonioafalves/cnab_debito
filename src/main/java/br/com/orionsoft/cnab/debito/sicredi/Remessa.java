package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.File;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Remessa extends File {
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
