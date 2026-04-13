package model.entity;

public class Marca {
    private String descricao;

    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public String consultarMarca(){
        return this.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "Marca: " + descricao;
    }
}
