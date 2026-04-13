package view;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {
    
    public HomeView() {
        setTitle("Sistema de Locação - FT Unicamp");
        setSize(450, 350); // Aumentei um pouco a altura para caber o novo botão
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10)); // Agora com 4 linhas

        JButton btnAutomoveis = new JButton("Gerenciar Veículos");
        JButton btnClientes = new JButton("Gerenciar Clientes");
        JButton btnLocacoes = new JButton("Registrar Locação (Retirada)");
        JButton btnDevolucao = new JButton("Registrar Devolução (Check-in)");

        btnAutomoveis.addActionListener(e -> new AutomovelGerenciaView().setVisible(true));
        btnClientes.addActionListener(e -> new ClientePermanenciaView().setVisible(true));
        btnLocacoes.addActionListener(e -> new LocacaoView().setVisible(true));
        btnDevolucao.addActionListener(e -> new AutomovelDevolucaoView().setVisible(true));

        add(btnAutomoveis);
        add(btnClientes);
        add(btnLocacoes);
        add(btnDevolucao);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomeView().setVisible(true));
    }
}