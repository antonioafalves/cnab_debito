/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.debito.itau;

import br.com.orionsoft.cnab.core.Arquivo;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;

public class HeaderLote extends Arquivo {
    @Campo(formato= FormatoCampo.ALFANUMERICO, tamanho=3)
    private String codigoBanco = "341";
    
    
}
