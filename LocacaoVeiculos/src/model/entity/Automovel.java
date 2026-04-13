package model.entity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Automovel {
    private String placaAutomovel;
    private long renavamAutomovel;
    private  String chassiAutomovel;
    private String corAutomovel;
    private int numeroPortasAutomovel;
    private int tipoCombustivelAutomovel;
    private long quilometragemAutomovel;
    private double valorLocacaoAutomovel;
    private Modelo modelo;

    public Automovel (String placaAutomovel, long renavamAutomovel, String chassiAutomovel, String corAutomovel, int numeroPortasAutomovel, int tipoCombustivelAutomovel, long quilometragemAutomovel, double valorLocacaoAutomovel, Modelo modelo){
        this.placaAutomovel = placaAutomovel;
        this.renavamAutomovel = renavamAutomovel;
        this.chassiAutomovel = chassiAutomovel;
        this.corAutomovel = corAutomovel;
        this.numeroPortasAutomovel = numeroPortasAutomovel;
        this.tipoCombustivelAutomovel = tipoCombustivelAutomovel;
        this.quilometragemAutomovel = quilometragemAutomovel;
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
        this.modelo = modelo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlacaAutomovel() {
        return placaAutomovel;
    }

    public void setPlacaAutomovel(String placaAutomovel) {
        this.placaAutomovel = placaAutomovel;
    }

    public long getRenavamAutomovel() {
        return renavamAutomovel;
    }

    public void setRenavamAutomovel(long renavamAutomovel) {
        this.renavamAutomovel = renavamAutomovel;
    }

    public String getChassiAutomovel() {
        return chassiAutomovel;
    }

    public void setChassiAutomovel(String chassiAutomovel) {
        this.chassiAutomovel = chassiAutomovel;
    }

    public String getCorAutomovel() {
        return corAutomovel;
    }

    public void setCorAutomovel(String corAutomovel) {
        this.corAutomovel = corAutomovel;
    }

    public int getNumeroPortasAutomovel() {
        return numeroPortasAutomovel;
    }

    public void setNumeroPortasAutomovel(int numeroPortasAutomovel) {
        this.numeroPortasAutomovel = numeroPortasAutomovel;
    }

    public int getTipoCombustivelAutomovel() {
        return tipoCombustivelAutomovel;
    }

    public void setTipoCombustivelAutomovel(int tipoCombustivelAutomovel) {
        this.tipoCombustivelAutomovel = tipoCombustivelAutomovel;
    }

    public long getQuilometragemAutomovel() {
        return quilometragemAutomovel;
    }

    public void setQuilometragemAutomovel(long quilometragemAutomovel) {
        this.quilometragemAutomovel = quilometragemAutomovel;
    }

    public double getValorLocacaoAutomovel() {
        return valorLocacaoAutomovel;
    }

    public void setValorLocacaoAutomovel(double valorLocacaoAutomovel) {
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
    }

    public String consultarAutomovel(){ //Colocar uma variavel recebendo antes
        return this.toString();
    }

    @Override
    public String toString(){
        return "Placa: " + placaAutomovel + "\nRenavam: " +renavamAutomovel + "\nChassi: " + chassiAutomovel + "\nCor: " + corAutomovel + "\nNumero de Portas: " + numeroPortasAutomovel + "\nTipo de Combustivel: " + tipoCombustivelAutomovel + "\nQuilometragem: " + quilometragemAutomovel + "\nValor Locacao: " + valorLocacaoAutomovel;
    }
}