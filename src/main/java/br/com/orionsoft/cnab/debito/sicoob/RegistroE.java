/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicoob;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author Antonio
 */
@Registro
public class RegistroE {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "E";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=25)
    private String codigoClienteEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=4)
    private String agenciaDebito;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=14)
    private String contaCorrenteAssociado;
    @Campo(formato= FormatoCampo.DATA_AAAAMMDD, tamanho=8)
    private Calendar dataVencimentoFatura;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=15)
    private BigDecimal valorDebito;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=2)
    private String codigoMoeda = "03";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=10)
    private String usoEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=70)
    private String filler2 = " ";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoMovimento = "0";

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getCodigoClienteEmpresa() {
        return codigoClienteEmpresa;
    }

    public String getAgenciaDebito() {
        return agenciaDebito;
    }

    public String getContaCorrenteAssociado() {
        return contaCorrenteAssociado;
    }

    public Calendar getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    public BigDecimal getValorDebito() {
        return valorDebito;
    }

    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public String getFiller2() {
        return filler2;
    }

    public String getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoClienteEmpresa(String codigoClienteEmpresa) {
        this.codigoClienteEmpresa = codigoClienteEmpresa;
    }

    public void setAgenciaDebito(String agenciaDebito) {
        this.agenciaDebito = agenciaDebito;
    }

    public void setContaCorrenteAssociado(String contaCorrenteAssociado) {
        this.contaCorrenteAssociado = contaCorrenteAssociado;
    }

    public void setDataVencimentoFatura(Calendar dataVencimentoFatura) {
        this.dataVencimentoFatura = dataVencimentoFatura;
    }

    public void setValorDebito(BigDecimal valorDebito) {
        this.valorDebito = valorDebito;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }
    
}
