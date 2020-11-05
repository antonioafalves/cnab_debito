/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.itau;

import br.com.orionsoft.cnab.core.Arquivo;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data @NoArgsConstructor
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
    private LocalDate dataGeracao;
    @Campo(formato= FormatoCampo.HORA, tamanho=6)
    private LocalTime horaGeracao;
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
