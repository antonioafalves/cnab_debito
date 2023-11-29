package br.com.orionsoft.cnab.debito.sicoob;

import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RemessaTest {
    
    @Test
    public void testGravar() throws Exception {
        int count = 2;
        BigDecimal total = new BigDecimal(0);
        Remessa r = new Remessa();
        
        Header h = new Header();
        h.setDataGeracaoArquivo(LocalDate.now());
        h.setNumeroSequencialArquivo(1);

        BigDecimal valor = BigDecimal.valueOf(31.27);
        RegistroE e = new RegistroE();
        e.setAgenciaDebito("4340");
        e.setCodigoClienteEmpresa("098020300000003");
        e.setContaCorrenteAssociado("636169");
        e.setDataVencimentoFatura(LocalDate.now());
        e.setUsoEmpresa("10519801");
        e.setValorDebito(valor);
        r.addRegistroE(e);
        count++;
        total = total.add(valor);
        
        valor = BigDecimal.valueOf(31.27);
        e = new RegistroE();
        e.setAgenciaDebito("4340");
        e.setCodigoClienteEmpresa("098020300000004");
        e.setContaCorrenteAssociado("667102");
        e.setDataVencimentoFatura(LocalDate.now());
        e.setUsoEmpresa("10519901");
        e.setValorDebito(valor);
        r.addRegistroE(e);
        count++;
        total = total.add(valor);
        
        Trailer t = new Trailer();
        t.setQuantidadeTotalRegistros(count);
        t.setValorTotalRegistros(total);
                
        r.setHeader(h);
        r.setTrailer(t);
        r.save(new PrintWriter("temp/remessa756.txt"));
    }
}
