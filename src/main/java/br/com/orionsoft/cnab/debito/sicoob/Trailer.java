package br.com.orionsoft.cnab.debito.sicoob;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Record
@Data @NoArgsConstructor
public class Trailer {
    @Field(pattern= Pattern.ALPHANUMERIC, size=1)
    private String codigoRegistro = "Z";
    @Field(pattern= Pattern.NUMERIC, size=6)
    private Integer quantidadeTotalRegistros;
    @Field(pattern= Pattern.DECIMAL, size=17)
    private BigDecimal valorTotalRegistros;
    @Field(pattern= Pattern.ALPHANUMERIC, size=126)
    private String filler = " ";
}
