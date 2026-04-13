package view;

import javax.swing.*;
import java.awt.*;

public class AutomovelCadastroView extends JFrame {
    private JTextField txtPlaca, txtRenavam, txtChassi, txtCor, txtValor;

    public AutomovelCadastroView() {
        setTitle("Cadastrar Veículo [RF1]");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Placa:")); txtPlaca = new JTextField(); add(txtPlaca);
        add(new JLabel("Renavam:")); txtRenavam = new JTextField(); add(txtRenavam);
        add(new JLabel("Chassi:")); txtChassi = new JTextField(); add(txtChassi);
        add(new JLabel("Cor:")); txtCor = new JTextField(); add(txtCor);
        add(new JLabel("Valor Locação:")); txtValor = new JTextField(); add(txtValor);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            // Aqui os dados seriam enviados ao AutomovelController para validação
            JOptionPane.showMessageDialog(this, "Veículo enviado para validação!");
        });
        
        add(new JLabel("")); add(btnSalvar);
    }
}