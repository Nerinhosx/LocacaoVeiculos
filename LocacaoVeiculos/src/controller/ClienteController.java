package controller;

import model.entity.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    
    // Banco de dados em memória
    private static List<Cliente> bancoClientes = new ArrayList<>();

    public String persistirCliente(String cpfTxt, String nome, String telefone, String email) {
        if (nome.isEmpty() || cpfTxt.isEmpty()) {
            return "Erro: Nome e CPF são obrigatórios.";
        }

        try {
            long cpf = Long.parseLong(cpfTxt);
            
            // Verifica se já existe para atualizar ou criar novo
            Cliente clienteExistente = buscarPorCpf(cpf);
            if (clienteExistente != null) {
                clienteExistente.setTelefoneCliente(telefone);
                clienteExistente.setEmailCliente(email);
                return "Sucesso: Cliente atualizado!";
            } else {
                Cliente novoCliente = new Cliente(cpf, nome, "Endereço não informado", telefone, email);
                bancoClientes.add(novoCliente);
                return "Sucesso: Novo cliente cadastrado!";
            }
        } catch (NumberFormatException e) {
            return "Erro: CPF deve conter apenas números.";
        }
    }

    public Cliente buscarPorCpf(long cpf) {
        for (Cliente c : bancoClientes) {
            if (c.getCpfCliente() == cpf) {
                return c;
            }
        }
        return null;
    }
}