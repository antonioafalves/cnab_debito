/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicoob;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.util.Calendar;

/**
 *
 * @author Antonio
 */
@Registro
public class Header {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "A";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRemessa = "1";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String codigoConvenio = "4340000013";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String nomeEmpresaConveniada = "UNIODONTO DE MARINGA";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=3)
    private String codigoBanco = "756";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String nomeBanco = "SICOOB";
    @Campo(formato= FormatoCampo.DATA_AAAAMMDD, tamanho=8)
    private Calendar dataGeracaoArquivo;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private Integer numeroSequencialArquivo;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=2)
    private String versaoLeiaute = "04";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=19)
    private String identificacaoServico = "DEBITO AUTOMATICO";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=50)
    private String filler = " ";

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getCodigoRemessa() {
        return codigoRemessa;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public String getNomeEmpresaConveniada() {
        return nomeEmpresaConveniada;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public Calendar getDataGeracaoArquivo() {
        return dataGeracaoArquivo;
    }

    public Integer getNumeroSequencialArquivo() {
        return numeroSequencialArquivo;
    }

    public String getVersaoLeiaute() {
        return versaoLeiaute;
    }

    public String getIdentificacaoServico() {
        return identificacaoServico;
    }

    public String getFiller() {
        return filler;
    }

    public void setDataGeracaoArquivo(Calendar dataGeracaoArquivo) {
        this.dataGeracaoArquivo = dataGeracaoArquivo;
    }

    public void setNumeroSequencialArquivo(Integer numeroSequencialArquivo) {
        this.numeroSequencialArquivo = numeroSequencialArquivo;
    }
    
}
