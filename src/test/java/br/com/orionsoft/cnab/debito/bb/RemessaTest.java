/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Calendar;
import org.joda.time.DateMidnight;
import org.junit.*;

/**
 *
 * @author Antonio
 */
public class RemessaTest {
    
    public RemessaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGravar() throws FileNotFoundException, Exception {
        int totalRegistrosArquivo = 0;
        BigDecimal valorDebito;
        BigDecimal valorTotal = BigDecimal.ZERO;
        Remessa r = DebitoBBFactory.getRemessa();
        
        Header h = DebitoBBFactory.getHeader();
        h.setCodigoConvenio("Uniodonto");
        h.setCodigoRemessa(Header.CodigoRemessa.REMESSA.getValue());
        h.setDataGeracao(Calendar.getInstance());
        h.setNomeEmpresa("UNIODONTO MARINGA");
        h.setNumeroSequencialArquivo(1);
        r.setHeader(h);
        
        RegistroE e = DebitoBBFactory.getRegistroE();
        e.setAgenciaDebito("1187");
        e.setCodigoMovimento(0);
        e.setDataVencimento(new DateMidnight(2012, 2, 15).toGregorianCalendar());
        e.setIdentificacaoClienteBanco("13211X");
        e.setIdentificacaoClienteEmpresa("02084");
        e.setUsoEmpresa("");
        valorDebito = new BigDecimal(100.11);
        e.setValorDebito(valorDebito);
        valorTotal = valorTotal.add(valorDebito);
        r.getDetalhe().add(e);
        totalRegistrosArquivo++;
        
        e = DebitoBBFactory.getRegistroE();
        e.setAgenciaDebito("3512");
        e.setCodigoMovimento(0);
        e.setDataVencimento(new DateMidnight(2012, 2, 15).toGregorianCalendar());
        e.setIdentificacaoClienteBanco("254509");
        e.setIdentificacaoClienteEmpresa("11912");
        e.setUsoEmpresa("");
        valorDebito = new BigDecimal(256.00);
        e.setValorDebito(valorDebito);
        valorTotal = valorTotal.add(valorDebito);
        r.getDetalhe().add(e);
        totalRegistrosArquivo++;
        
        Trailler t = DebitoBBFactory.getTrailler();
        t.setTotalRegistrosArquivo(totalRegistrosArquivo + 2);
        t.setValorTotalRegistrosArquivo(valorTotal);
        r.setTrailler(t);
        
        r.gravar(new PrintWriter("remessa.txt"));
    }
}
