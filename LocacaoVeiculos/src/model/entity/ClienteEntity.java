import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {

    @EqualsAndHashCode.Include
    private Long id;

    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
}
