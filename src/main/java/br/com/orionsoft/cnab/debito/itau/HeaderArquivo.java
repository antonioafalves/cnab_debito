/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.itau;

import br.com.orionsoft.cnab.core.Arquivo;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import org.joda.time.DateMidnight;
import org.joda.time.Hours;

/**
 *
 * @author Antonio
 */
public class HeaderArquivo extends Arquivo {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=3)
    private String codigoBanco = "341";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=4)
    private String codigoLote = "0000";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1) @Identificador
    private String tipoRegistro = "0";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=9)
    private String brancos1 = "";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int codigoInscricao = CodigoInscricao.CPF.getValue();
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=14)
    private String numeroInscricao;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=13)
    private String convenio;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=7)
    private String brancos2;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int brancos3;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=4)
    private int agencia;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String brancos4 = "";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=7)
    private int brancos5;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=5)
    private int conta;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String brancos6 = "";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int dac;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=30)
    private String nome;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=30)
    private String banco = "BANCO ITAU";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=10)
    private String brancos7 = "";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=1)
    private int codigo = 1;
    @Campo(formato= FormatoCampo.DATA_DDMMAAAA, tamanho=8)
    private DateMidnight dataGeracao;
    @Campo(formato= FormatoCampo.HORA, tamanho=6)
    private Hours horaGeracao;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private int sequencia;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=3)
    private String layout = "040";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=5)
    private int unidadeDensidade = 0;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=20)
    private String reservadoBanco = "";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=49)
    private String brancos8 = "";

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public String getBrancos1() {
        return brancos1;
    }

    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    public int getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(int brancos3) {
        this.brancos3 = brancos3;
    }

    public String getBrancos4() {
        return brancos4;
    }

    public int getBrancos5() {
        return brancos5;
    }

    public String getBrancos6() {
        return brancos6;
    }

    public String getBrancos7() {
        return brancos7;
    }

    public String getBrancos8() {
        return brancos8;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public int getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(int codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public int getDac() {
        return dac;
    }

    public void setDac(int dac) {
        this.dac = dac;
    }

    public DateMidnight getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(DateMidnight dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Hours getHoraGeracao() {
        return horaGeracao;
    }

    public void setHoraGeracao(Hours horaGeracao) {
        this.horaGeracao = horaGeracao;
    }

    public String getLayout() {
        return layout;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public String getReservadoBanco() {
        return reservadoBanco;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public int getUnidadeDensidade() {
        return unidadeDensidade;
    }

    protected enum CodigoInscricao {
        CPF(1),
        CNPJ(2);
        
        private int value;

        private CodigoInscricao(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
