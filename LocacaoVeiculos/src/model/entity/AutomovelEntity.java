

import java.math.BigDecimal;
import java.util.Objects;

public class AutomovelEntity {

    private Long id;
    private String placa;
    private String renavam;
    private String chassi;
    private String cor;
    private Integer numeroPortas;
    private Integer tipoCombustivel;
    private Long quilometragem;
    private BigDecimal valorLocacao;
    private ModeloEntity modelo;

    public AutomovelEntity() {
    }

    public AutomovelEntity(Long id, String placa, String renavam, String chassi, String cor, Integer numeroPortas, Integer tipoCombustivel, Long quilometragem, BigDecimal valorLocacao, ModeloEntity modelo) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.cor = cor;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.valorLocacao = valorLocacao;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Integer getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(Integer tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public BigDecimal getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(BigDecimal valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public ModeloEntity getModelo() {
        return modelo;
    }

    public void setModelo(ModeloEntity modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutomovelEntity automovel = (AutomovelEntity) o;
        return Objects.equals(id, automovel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}