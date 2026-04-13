package view;

import javax.swing.*;
import java.awt.*;

public class AutomovelGerenciaView extends JFrame {
    public AutomovelGerenciaView() {
        setTitle("Gerenciamento de Automóveis");
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Tabela para listar automóveis (RF5) [cite: 23]
        String[] colunas = {"Placa", "Modelo", "Cor", "Valor Locação"};
        Object[][] dados = {}; // Seriam preenchidos via AutomovelController
        JTable tabela = new JTable(dados, colunas);

        JPanel painelBotoes = new JPanel();
        JButton btnCadastrar = new JButton("Novo Veículo");
        JButton btnExcluir = new JButton("Excluir Veículo");

        btnCadastrar.addActionListener(e -> new AutomovelCadastroView().setVisible(true));
        btnExcluir.addActionListener(e -> new AutomovelExclusaoView().setVisible(true));

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnExcluir);

        add(new JScrollPane(tabela), BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }
}