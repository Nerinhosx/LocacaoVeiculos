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

@Entity
@Table(name = "tb_automovel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AutomovelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, unique = true, length = 7)
    private String placa;

    @Column(nullable = false, unique = true, length = 11)
    private String renavam;

    @Column(nullable = false, unique = true, length = 17)
    private String chassi;

    @Column(length = 30)
    private String cor;

    @Column(nullable = false)
    private Integer numeroPortas;

    @Column(nullable = false)
    private Integer tipoCombustivel;

    @Column(nullable = false)
    private Long quilometragem;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorLocacao;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private ModeloEntity modelo;
}
