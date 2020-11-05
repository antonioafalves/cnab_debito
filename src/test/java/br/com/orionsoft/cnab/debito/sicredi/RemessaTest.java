/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicredi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

//@SpringBootTest
public class RemessaTest {
    
    public RemessaTest() {
    }
    
//    @Test
    public void testGravar() throws Exception {
        int count = 2;
        BigDecimal total = new BigDecimal(0);
        Remessa r = new Remessa();
        
        Header h = new Header();
        h.setDataGeracaoArquivo(Calendar.getInstance());
        h.setNumeroSequencialArquivo(1);

        BigDecimal valor = new BigDecimal(65.09);
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
        
        valor = new BigDecimal(73.94);
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
        r.gravar(new PrintWriter("remessa748.txt"));
        Assertions.assertTrue(true);
    }
}
