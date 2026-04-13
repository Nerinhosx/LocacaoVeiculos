package view;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {
    public HomeView() {
        setTitle("Sistema de Locação - FT Unicamp");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnAutomoveis = new JButton("Gerenciar Veículos");
        JButton btnClientes = new JButton("Gerenciar Clientes");
        JButton btnLocacoes = new JButton("Registrar Locação");

        btnAutomoveis.addActionListener(e -> new AutomovelGerenciaView().setVisible(true));
        btnClientes.addActionListener(e -> new ClientePermanenciaView().setVisible(true));
        btnLocacoes.addActionListener(e -> new LocacaoView().setVisible(true));

        add(btnAutomoveis);
        add(btnClientes);
        add(btnLocacoes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomeView().setVisible(true));
    }
}