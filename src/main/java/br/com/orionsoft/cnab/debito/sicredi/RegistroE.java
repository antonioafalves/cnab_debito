package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Record
@Data @NoArgsConstructor
public class RegistroE {
    @Field(pattern= Pattern.ALPHANUMERIC, size=1)
    private String codigoRegistro = "E";
    @Field(pattern= Pattern.ALPHANUMERIC, size=25)
    private String codigoClienteEmpresa;
    @Field(pattern= Pattern.ALPHANUMERIC, size=4)
    private String agenciaDebito;
    @Field(pattern= Pattern.ALPHANUMERIC, size=7)
    private String contaCorrenteAssociado;
    @Field(pattern= Pattern.ALPHANUMERIC, size=7)
    private String filler1 = " ";
    @Field(pattern= Pattern.DATE_AAAAMMDD, size=8)
    private LocalDate dataVencimentoFatura;
    @Field(pattern= Pattern.DECIMAL, size=15)
    private BigDecimal valorDebito;
    @Field(pattern= Pattern.ALPHANUMERIC, size=2)
    private String codigoMoeda = "03";
    @Field(pattern= Pattern.ALPHANUMERIC, size=10)
    private String usoEmpresa;
    @Field(pattern= Pattern.ALPHANUMERIC, size=70)
    private String filler2 = " ";
    @Field(pattern= Pattern.ALPHANUMERIC, size=1)
    private String codigoMovimento = "0";
}
