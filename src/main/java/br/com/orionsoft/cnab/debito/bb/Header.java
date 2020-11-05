/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.bb;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Registro
@Data @NoArgsConstructor
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

}
