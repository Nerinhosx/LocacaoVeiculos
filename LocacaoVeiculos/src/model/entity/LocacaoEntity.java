import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Locacao {

    @EqualsAndHashCode.Include
    private Long id;

    private LocalDateTime dataHoraRetirada;
    private LocalDateTime dataHoraDevolucao;
    private Long quilometragemRetirada;
    private Long quilometragemDevolucao;
    private BigDecimal valorCaucao;
    private BigDecimal valorDevolucao;
    private Boolean devolvida = false;
    private Automovel automovel;
    private Cliente cliente;
}
