import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Automovel {

    @EqualsAndHashCode.Include
    private Long id;
    
    private String placa;
    private String renavam;
    private String chassi;
    private String cor;
    private Integer numeroPortas;
    private Integer tipoCombustivel; 
    private Long quilometragem;
    private BigDecimal valorLocacao;
    private Modelo modelo;
}
