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

/**
 *
 * @author Antonio
 */
@Registro
public class Trailler {
    @Identificador
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "Z";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private int totalRegistrosArquivo;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=17)
    private BigDecimal valorTotalRegistrosArquivo;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=126)
    private String reservado = "";

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getReservado() {
        return reservado;
    }

    public int getTotalRegistrosArquivo() {
        return totalRegistrosArquivo;
    }

    public void setTotalRegistrosArquivo(int totalRegistrosArquivo) {
        this.totalRegistrosArquivo = totalRegistrosArquivo;
    }

    public BigDecimal getValorTotalRegistrosArquivo() {
        return valorTotalRegistrosArquivo;
    }

    public void setValorTotalRegistrosArquivo(BigDecimal valorTotalRegistrosArquivo) {
        this.valorTotalRegistrosArquivo = valorTotalRegistrosArquivo;
    }

}
