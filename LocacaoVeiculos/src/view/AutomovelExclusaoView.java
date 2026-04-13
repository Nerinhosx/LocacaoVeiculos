package view;

import controller.AutomovelController;
import javax.swing.*;
import java.awt.*;

public class AutomovelExclusaoView extends JFrame {
    private JTextField txtPlaca;
    private JTextArea areaDados;
    private AutomovelController controller = new AutomovelController();

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
        btnExcluir.setEnabled(false);

        btnBuscar.addActionListener(e -> {
            String dados = controller.buscarParaExclusao(txtPlaca.getText());
            if (dados != null) {
                areaDados.setText(dados);
                btnExcluir.setEnabled(true);
            } else {
                areaDados.setText("Veículo não encontrado.");
                btnExcluir.setEnabled(false);
            }
        });

        btnExcluir.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover este veículo?");
            if (confirm == JOptionPane.YES_OPTION) {
                if(controller.excluirAutomovel(txtPlaca.getText())) {
                    JOptionPane.showMessageDialog(this, "Veículo removido com sucesso!");
                    dispose();
                }
            }
        });

        add(painelBusca, BorderLayout.NORTH);
        add(new JScrollPane(areaDados), BorderLayout.CENTER);
        add(btnExcluir, BorderLayout.SOUTH);
    }
}