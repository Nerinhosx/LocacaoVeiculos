package view;

import controller.LocacaoController;

import javax.swing.*;
import java.awt.*;

public class LocacaoView extends JFrame {
    private JTextField txtCpfCliente, txtPlacaVeiculo, txtData, txtHora, txtKm, txtCaucao;
    private LocacaoController controller = new LocacaoController();

    public LocacaoView() {
        setTitle("Registro de Locação [RF11 / RF13]");
        setSize(450, 400);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new JLabel(" CPF do Cliente:")); txtCpfCliente = new JTextField(); add(txtCpfCliente);
        add(new JLabel(" Placa do Veículo:")); txtPlacaVeiculo = new JTextField(); add(txtPlacaVeiculo);
        add(new JLabel(" Data (AAAA-MM-DD):")); txtData = new JTextField(); add(txtData);
        add(new JLabel(" Hora (HH:MM):")); txtHora = new JTextField(); add(txtHora);
        add(new JLabel(" KM na Retirada:")); txtKm = new JTextField(); add(txtKm);
        add(new JLabel(" Valor Caução:")); txtCaucao = new JTextField(); add(txtCaucao);

        JButton btnCalcular = new JButton("Calcular Estimativa (RF12)");
        JButton btnRegistrar = new JButton("Registrar Retirada");

        btnCalcular.addActionListener(e -> {
            String estimativa = controller.calcularEstimativa('A');
            JOptionPane.showMessageDialog(this, estimativa);
        });

        btnRegistrar.addActionListener(e -> {
            String mensagem = controller.registrarRetirada(
                txtCpfCliente.getText(),
                txtPlacaVeiculo.getText(),
                txtData.getText(),
                txtHora.getText(),
                txtKm.getText(),
                txtCaucao.getText()
            );
            JOptionPane.showMessageDialog(this, mensagem);
            if(mensagem.contains("Sucesso")) dispose();
        });

        add(btnCalcular);
        add(btnRegistrar);
    }
}