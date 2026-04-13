package model.entity;

public class Cliente {
    private long cpfCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String emailCliente;

    public Cliente (long cpfCliente, String nomeCliente, String enderecoCliente, String telefoneCliente, String emailCliente){
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public long getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(long cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString(){
        return "CPF: " + cpfCliente + "\nEndereco: " + enderecoCliente + "\nTelefone: " + telefoneCliente + "\nEmail: " + emailCliente;
    }

    public String consultarCliente(){ //Colocar variavel recebendo valor antes
        return this.toString();
    }
}
