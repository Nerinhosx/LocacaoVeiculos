package model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
public class Locacao {
    private LocalDate dataLocacao;
    private LocalTime horaLocacao;
    private LocalDate dataDevolucao;
    private LocalTime horaDevolucao;
    private long quilometragemLocacao;
    private long quilometragemDevolucao;
    private double valorCaucao;
    private double valorDevolucao;
    private boolean locacaoDevolvida;
    private Automovel automovel;
    private Cliente cliente;

    public Locacao(LocalDate dataLocacao, LocalTime horaLocacao, LocalDate dataDevolucao, LocalTime horaDevolucao, long quilometragemLocacao, long quilometragemDevolucao, double valorCaucao, double valorDevolucao, boolean locacaoDevolvida, Automovel automovel, Cliente cliente){
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.quilometragemDevolucao = quilometragemDevolucao;
        this.valorCaucao = valorCaucao;
        this.valorDevolucao = valorDevolucao;
        this.locacaoDevolvida = locacaoDevolvida;
        this.automovel = automovel;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public long getQuilometragemLocacao() {
        return quilometragemLocacao;
    }

    public void setQuilometragemLocacao(long quilometragemLocacao) {
        this.quilometragemLocacao = quilometragemLocacao;
    }

    public long getQuilometragemDevolucao() {
        return quilometragemDevolucao;
    }

    public void setQuilometragemDevolucao(long quilometragemDevolucao) {
        this.quilometragemDevolucao = quilometragemDevolucao;
    }

    public double getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public double getValorDevolucao() {
        return valorDevolucao;
    }

    public void setValorDevolucao(double valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
    }

    public boolean isLocacaoDevolvida() {
        return locacaoDevolvida;
    }

    public void setLocacaoDevolvida(boolean locacaoDevolvida) {
        this.locacaoDevolvida = locacaoDevolvida;
    }

    public void registrarLocacao (LocalDate dataLocacao, LocalTime horaLocacao, long quilometragemLocacao, double valorCaucao, Automovel automovel, Cliente cliente){
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.valorCaucao = valorCaucao;
        this.automovel = automovel;
        this.cliente = cliente;
    }
}
