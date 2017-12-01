/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.math.BigDecimal;

/**
 *
 * @author Antonio
 */
@Registro
public class Trailer {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "Z";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private Integer quantidadeTotalRegistros;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=17)
    private BigDecimal valorTotalRegistros;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=126)
    private String filler = " ";

    public Integer getQuantidadeTotalRegistros() {
        return quantidadeTotalRegistros;
    }

    public void setQuantidadeTotalRegistros(Integer quantidadeTotalRegistros) {
        this.quantidadeTotalRegistros = quantidadeTotalRegistros;
    }

    public BigDecimal getValorTotalRegistros() {
        return valorTotalRegistros;
    }

    public void setValorTotalRegistros(BigDecimal valorTotalRegistros) {
        this.valorTotalRegistros = valorTotalRegistros;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getFiller() {
        return filler;
    }

}
