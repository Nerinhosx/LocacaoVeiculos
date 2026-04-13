package view;

import controller.ClienteController;
import javax.swing.*;
import java.awt.*;

public class ClientePermanenciaView extends JFrame {
    private JTextField txtCpf, txtNome, txtTelefone, txtEmail;
    private ClienteController controller = new ClienteController();

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
            String mensagem = controller.persistirCliente(
                txtCpf.getText(),
                txtNome.getText(),
                txtTelefone.getText(),
                txtEmail.getText()
            );
            JOptionPane.showMessageDialog(this, mensagem);
        });

        add(new JLabel("")); add(btnAcao);
    }
}