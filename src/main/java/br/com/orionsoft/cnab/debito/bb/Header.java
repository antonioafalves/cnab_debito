/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.util.Calendar;

/**
 *
 * @author Antonio
 */
@Registro
public class Header {
    @Identificador
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "A";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int codigoRemessa = CodigoRemessa.REMESSA.getValue();
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String codigoConvenio;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String nomeEmpresa;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=3)
    private String codigoBanco = "001";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String nomeBanco = "BANCO DO BRASIL";
    @Campo(formato= FormatoCampo.DATA_AAAAMMDD, tamanho=8)
    private Calendar dataGeracao;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private int numeroSequencialArquivo;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=2)
    private String versaoLayout = "04";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=17)
    private String identificacaoServico = "DEBITO AUTOMATICO";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=52)
    private String reservado = "";

    protected enum CodigoRemessa {
        REMESSA(1),
        RETORNO(2);

        private int value;

        private CodigoRemessa(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getIdentificacaoServico() {
        return identificacaoServico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public String getReservado() {
        return reservado;
    }

    public String getVersaoLayout() {
        return versaoLayout;
    }
            
    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public int getCodigoRemessa() {
        return codigoRemessa;
    }

    public void setCodigoRemessa(int codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
    }

    public Calendar getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Calendar dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getNumeroSequencialArquivo() {
        return numeroSequencialArquivo;
    }

    public void setNumeroSequencialArquivo(int numeroSequencialArquivo) {
        this.numeroSequencialArquivo = numeroSequencialArquivo;
    }

}
