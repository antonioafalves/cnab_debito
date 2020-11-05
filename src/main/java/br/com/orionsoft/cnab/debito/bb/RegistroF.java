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

import java.math.BigDecimal;
import java.time.LocalDate;

@Registro
@Data @NoArgsConstructor
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
    private LocalDate dataDebito;
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

}
