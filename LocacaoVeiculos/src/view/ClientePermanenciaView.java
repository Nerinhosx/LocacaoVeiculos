package view;

import javax.swing.*;
import java.awt.*;

public class ClientePermanenciaView extends JFrame {
    private JTextField txtCpf, txtNome, txtTelefone, txtEmail;

    public ClientePermanenciaView() {
        setTitle("Cadastro / Atualização de Cliente [RF8/RF9]");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("CPF:")); txtCpf = new JTextField(); add(txtCpf);
        add(new JLabel("Nome:")); txtNome = new JTextField(); add(txtNome);
        add(new JLabel("Telefone:")); txtTelefone = new JTextField(); add(txtTelefone);
        add(new JLabel("Email:")); txtEmail = new JTextField(); add(txtEmail);

        JButton btnAcao = new JButton("Persistir Dados");
        btnAcao.addActionListener(e -> {
            // Comunicação com ClienteController para validação de dados (RF10)
            JOptionPane.showMessageDialog(this, "Processando dados do Cliente...");
        });

        add(new JLabel("")); add(btnAcao);
    }
}