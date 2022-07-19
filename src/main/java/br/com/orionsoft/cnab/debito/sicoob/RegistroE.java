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

import java.math.BigDecimal;
import java.time.LocalDate;

@Registro
@Data @NoArgsConstructor
public class RegistroE {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "E";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=25)
    private String codigoClienteEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=4)
    private String agenciaDebito;
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=14)
    private String contaCorrenteAssociado;
    @Campo(formato= FormatoCampo.DATA_AAAAMMDD, tamanho=8)
    private LocalDate dataVencimentoFatura;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=15)
    private BigDecimal valorDebito;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=2)
    private String codigoMoeda = "03";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=10)
    private String usoEmpresa;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=70)
    private String filler2 = " ";
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoMovimento = "0";
}
