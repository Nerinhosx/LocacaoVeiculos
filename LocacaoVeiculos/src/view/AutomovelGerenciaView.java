package view;

import controller.AutomovelController;
import javax.swing.*;
import java.awt.*;

public class AutomovelGerenciaView extends JFrame {
    private AutomovelController controller = new AutomovelController();

    public AutomovelGerenciaView() {
        setTitle("Gerenciamento de Automóveis");
        setSize(600, 400);
        setLayout(new BorderLayout());

        String[] colunas = {"Placa", "Modelo", "Cor", "Valor Locação"};
        Object[][] dados = controller.getDadosTabela();
        JTable tabela = new JTable(dados, colunas);

        JPanel painelBotoes = new JPanel();
        JButton btnCadastrar = new JButton("Novo Veículo");
        JButton btnExcluir = new JButton("Excluir Veículo");
        JButton btnAtualizar = new JButton("Atualizar Lista");

        btnCadastrar.addActionListener(e -> new AutomovelCadastroView().setVisible(true));
        btnExcluir.addActionListener(e -> new AutomovelExclusaoView().setVisible(true));
        btnAtualizar.addActionListener(e -> {
            dispose();
            new AutomovelGerenciaView().setVisible(true);
        });

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnAtualizar);

        add(new JScrollPane(tabela), BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }
}