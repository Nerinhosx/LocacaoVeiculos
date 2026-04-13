package view;

import controller.LocacaoController;

import javax.swing.*;
import java.awt.*;

public class AutomovelDevolucaoView extends JFrame {
    private JTextField txtPlaca, txtKmFinal, txtData, txtHora;
    private JTextArea areaResumo;
    private LocacaoController controller = new LocacaoController();

    public AutomovelDevolucaoView() {
        setTitle("Registrar Devolução (Check-in) [RF13]");
        setSize(450, 450);
        setLayout(new BorderLayout(10, 10));

        JPanel painelCampos = new JPanel(new GridLayout(5, 2, 5, 5));
        painelCampos.add(new JLabel(" Placa do Veículo:")); txtPlaca = new JTextField(); painelCampos.add(txtPlaca);
        painelCampos.add(new JLabel(" KM Final:")); txtKmFinal = new JTextField(); painelCampos.add(txtKmFinal);
        painelCampos.add(new JLabel(" Data Devolução (AAAA-MM-DD):")); txtData = new JTextField(); painelCampos.add(txtData);
        painelCampos.add(new JLabel(" Hora Devolução (HH:MM):")); txtHora = new JTextField(); painelCampos.add(txtHora);

        areaResumo = new JTextArea();
        areaResumo.setEditable(false);
        areaResumo.setBorder(BorderFactory.createTitledBorder("Resumo do Fechamento"));

        JButton btnFinalizar = new JButton("Calcular e Finalizar");
        btnFinalizar.addActionListener(e -> {
            String resultado = controller.registrarDevolucao(
                txtPlaca.getText(),
                txtData.getText(),
                txtHora.getText(),
                txtKmFinal.getText()
            );
            areaResumo.setText(resultado);
            if(resultado.contains("Sucesso")) {
                JOptionPane.showMessageDialog(this, "Veículo desalocado com sucesso!");
            }
        });

        add(painelCampos, BorderLayout.NORTH);
        add(new JScrollPane(areaResumo), BorderLayout.CENTER);
        add(btnFinalizar, BorderLayout.SOUTH);
    }
}