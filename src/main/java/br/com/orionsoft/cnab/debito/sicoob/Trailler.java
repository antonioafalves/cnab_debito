/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicoob;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.math.BigDecimal;

/**
 *
 * @author Antonio
 */
@Registro
public class Trailler {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "Z";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private Integer quantidadeTotalRegistros;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=17)
    private BigDecimal valorTotalRegistros;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=126)
    private String filler = " ";

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public Integer getQuantidadeTotalRegistros() {
        return quantidadeTotalRegistros;
    }

    public BigDecimal getValorTotalRegistros() {
        return valorTotalRegistros;
    }

    public String getFiller() {
        return filler;
    }

    public void setQuantidadeTotalRegistros(Integer quantidadeTotalRegistros) {
        this.quantidadeTotalRegistros = quantidadeTotalRegistros;
    }

    public void setValorTotalRegistros(BigDecimal valorTotalRegistros) {
        this.valorTotalRegistros = valorTotalRegistros;
    }
    
}
