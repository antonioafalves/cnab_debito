/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author Antonio
 */
@Registro
public class RegistroF {
    @Identificador
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "F";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=25)
    private String identificacaoClienteEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=4)
    private String agenciaDebito;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=14)
    private String identificacaoClienteBanco;
    @Campo(formato= FormatoCampo.DATA_AAAAMMDD, tamanho=8)
    private Calendar dataDebito;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=15)
    private BigDecimal valorDebitado;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=2)
    private String codigoRetorno;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=70)
    private String usoEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=10)
    private String reservado;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int codigoMovimento;

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getReservado() {
        return reservado;
    }

    public String getAgenciaDebito() {
        return agenciaDebito;
    }

    public void setAgenciaDebito(String agenciaDebito) {
        this.agenciaDebito = agenciaDebito;
    }

    public int getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(int codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public Calendar getDataDebito() {
        return dataDebito;
    }

    public void setDataDebito(Calendar dataDebito) {
        this.dataDebito = dataDebito;
    }

    public String getIdentificacaoClienteBanco() {
        return identificacaoClienteBanco;
    }

    public void setIdentificacaoClienteBanco(String identificacaoClienteBanco) {
        this.identificacaoClienteBanco = identificacaoClienteBanco;
    }

    public String getIdentificacaoClienteEmpresa() {
        return identificacaoClienteEmpresa;
    }

    public void setIdentificacaoClienteEmpresa(String identificacaoClienteEmpresa) {
        this.identificacaoClienteEmpresa = identificacaoClienteEmpresa;
    }

    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

    public BigDecimal getValorDebitado() {
        return valorDebitado;
    }

    public void setValorDebitado(BigDecimal valorDebitado) {
        this.valorDebitado = valorDebitado;
    }
    
}
