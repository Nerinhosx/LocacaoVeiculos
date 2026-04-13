import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_locacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LocacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dataHoraRetirada;

    @Column
    private LocalDateTime dataHoraDevolucao;

    @Column(nullable = false)
    private Long quilometragemRetirada;

    @Column
    private Long quilometragemDevolucao;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorCaucao;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorDevolucao;

    @Column(nullable = false)
    private Boolean devolvida = false;

    @ManyToOne
    @JoinColumn(name = "automovel_id", nullable = false)
    private AutomovelEntity automovel;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;
}
