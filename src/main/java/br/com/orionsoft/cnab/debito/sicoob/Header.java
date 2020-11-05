/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.sicoob;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Registro
@Data @NoArgsConstructor
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

}
