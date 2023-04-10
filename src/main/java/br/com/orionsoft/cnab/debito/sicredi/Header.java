package br.com.orionsoft.cnab.debito.sicredi;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Record
@Data @NoArgsConstructor
public class Header {
    @Field(pattern= Pattern.ALPHANUMERIC, size=1)
    private String codigoRegistro = "A";
    @Field(pattern= Pattern.ALPHANUMERIC, size=1)
    private String codigoRemessa = "1";
    @Field(pattern= Pattern.ALPHANUMERIC, size=20)
    private String codigoConvenio = "EX";
    @Field(pattern= Pattern.ALPHANUMERIC, size=20)
    private String nomeEmpresaConveniada = "UNIODONTO DE MARINGA";
    @Field(pattern= Pattern.ALPHANUMERIC, size=3)
    private String codigoBanco = "748";
    @Field(pattern= Pattern.ALPHANUMERIC, size=20)
    private String nomeBanco = "SICREDI CENTRAL";
    @Field(pattern= Pattern.DATE_AAAAMMDD, size=8)
    private LocalDate dataGeracaoArquivo;
    @Field(pattern= Pattern.NUMERIC, size=6)
    private Integer numeroSequencialArquivo;
    @Field(pattern= Pattern.ALPHANUMERIC, size=2)
    private String versaoLeiaute = "04";
    @Field(pattern= Pattern.ALPHANUMERIC, size=19)
    private String identificacaoServico = "DEBITO AUTOMATICO";
    @Field(pattern= Pattern.ALPHANUMERIC, size=50)
    private String filler = " ";
}
