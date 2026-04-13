package view;

import javax.swing.*;
import java.awt.*;

public class AutomovelExclusaoView extends JFrame {
    private JTextField txtPlaca;
    private JTextArea areaDados;

    public AutomovelExclusaoView() {
        setTitle("Exclusão de Veículo [RF4]");
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));

        JPanel painelBusca = new JPanel(new FlowLayout());
        painelBusca.add(new JLabel("Placa do Veículo:"));
        txtPlaca = new JTextField(10);
        JButton btnBuscar = new JButton("Buscar");
        painelBusca.add(txtPlaca);
        painelBusca.add(btnBuscar);

        areaDados = new JTextArea();
        areaDados.setEditable(false);
        areaDados.setBorder(BorderFactory.createTitledBorder("Dados do Veículo para Confirmação"));

        JButton btnExcluir = new JButton("Confirmar Exclusão");
        btnExcluir.setBackground(Color.RED);
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.setEnabled(false); // Só habilita após busca

        // Ações simulando comunicação com AutomovelController
        btnBuscar.addActionListener(e -> {
            String placa = txtPlaca.getText();
            if (!placa.isEmpty()) {
                areaDados.setText("Veículo encontrado: " + placa + "\nModelo: Exemplo\nStatus: Disponível");
                btnExcluir.setEnabled(true);
            }
        });

        btnExcluir.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover este veículo?");
            if (confirm == JOptionPane.YES_OPTION) {
                // Chama AutomovelController para marcar como inativo [cite: 21]
                JOptionPane.showMessageDialog(this, "Veículo removido com sucesso!");
                dispose();
            }
        });

        add(painelBusca, BorderLayout.NORTH);
        add(new JScrollPane(areaDados), BorderLayout.CENTER);
        add(btnExcluir, BorderLayout.SOUTH);
    }
}