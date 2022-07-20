package br.com.orionsoft.cnab.debito.sicredi;

import org.junit.Test;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

public class RemessaTest {
    
    @Test
    public void testGravar() throws Exception {
        int count = 2;
        BigDecimal total = new BigDecimal(0);
        Remessa r = new Remessa();
        
        Header h = new Header();
        h.setDataGeracaoArquivo(LocalDate.now());
        h.setNumeroSequencialArquivo(1);

        BigDecimal valor = BigDecimal.valueOf(65.09);
        RegistroE e = new RegistroE();
        e.setAgenciaDebito("0718");
        e.setCodigoClienteEmpresa("098003510000313");
        e.setContaCorrenteAssociado("2807390");
        e.setDataVencimentoFatura(LocalDate.now());
        e.setUsoEmpresa("10356101");
        e.setValorDebito(valor);
        r.addRegistroE(e);
        count++;
        total = total.add(valor);
        
        valor = BigDecimal.valueOf(73.94);
        e = new RegistroE();
        e.setAgenciaDebito("0718");
        e.setCodigoClienteEmpresa("098003510000351");
        e.setContaCorrenteAssociado("3775030");
        e.setDataVencimentoFatura(LocalDate.now());
        e.setUsoEmpresa("10356201");
        e.setValorDebito(valor);
        r.addRegistroE(e);
        count++;
        total = total.add(valor);
        
        Trailer t = new Trailer();
        t.setQuantidadeTotalRegistros(count);
        t.setValorTotalRegistros(total);
                
        r.setHeader(h);
        r.setTrailer(t);
        r.gravar(new PrintWriter("temp/remessa748.txt"));
    }
}
