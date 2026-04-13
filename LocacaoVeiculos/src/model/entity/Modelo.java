package model.entity;

public class Modelo {
    private String descricaoModelo;
    private Marca marca;

    public Modelo (String descricaoModelo, Marca marca){
        this.descricaoModelo = descricaoModelo;
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getDescricaoModelo() {
        return descricaoModelo;
    }

    public void setDescricaoModelo(String descricaoModelo) {
        this.descricaoModelo = descricaoModelo;
    }

    public String consultaModelo (){
        return this.toString();
    }

    @Override
    public String toString(){
        return "Modelo: " + descricaoModelo;
    }
}
