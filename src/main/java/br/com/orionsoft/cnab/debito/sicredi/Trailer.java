package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Registro
@Data @NoArgsConstructor
public class Trailer {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=1)
    private String codigoRegistro = "Z";
    @Campo(formato= FormatoCampo.NUMERICO, tamanho=6)
    private Integer quantidadeTotalRegistros;
    @Campo(formato= FormatoCampo.DECIMAL, tamanho=17)
    private BigDecimal valorTotalRegistros;
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=126)
    private String filler = " ";
}
