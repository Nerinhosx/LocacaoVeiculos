import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Locacao {

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

    public Locacao() {
    }

    public Locacao(Long id, LocalDateTime dataHoraRetirada, LocalDateTime dataHoraDevolucao, Long quilometragemRetirada, Long quilometragemDevolucao, BigDecimal valorCaucao, BigDecimal valorDevolucao, Boolean devolvida, Automovel automovel, Cliente cliente) {
        this.id = id;
        this.dataHoraRetirada = dataHoraRetirada;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.quilometragemRetirada = quilometragemRetirada;
        this.quilometragemDevolucao = quilometragemDevolucao;
        this.valorCaucao = valorCaucao;
        this.valorDevolucao = valorDevolucao;
        this.devolvida = devolvida;
        this.automovel = automovel;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraRetirada() {
        return dataHoraRetirada;
    }

    public void setDataHoraRetirada(LocalDateTime dataHoraRetirada) {
        this.dataHoraRetirada = dataHoraRetirada;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Long getQuilometragemRetirada() {
        return quilometragemRetirada;
    }

    public void setQuilometragemRetirada(Long quilometragemRetirada) {
        this.quilometragemRetirada = quilometragemRetirada;
    }

    public Long getQuilometragemDevolucao() {
        return quilometragemDevolucao;
    }

    public void setQuilometragemDevolucao(Long quilometragemDevolucao) {
        this.quilometragemDevolucao = quilometragemDevolucao;
    }

    public BigDecimal getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(BigDecimal valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public BigDecimal getValorDevolucao() {
        return valorDevolucao;
    }

    public void setValorDevolucao(BigDecimal valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
    }

    public Boolean getDevolvida() {
        return devolvida;
    }

    public void setDevolvida(Boolean devolvida) {
        this.devolvida = devolvida;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locacao locacao = (Locacao) o;
        return Objects.equals(id, locacao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
