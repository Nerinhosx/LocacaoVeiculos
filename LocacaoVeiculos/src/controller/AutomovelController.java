package controller;

import model.entity.Automovel;
import java.util.ArrayList;
import java.util.List;

public class AutomovelController {

    private static List<Automovel> frota = new ArrayList<>();

    public String salvarAutomovel(String placa, String renavamTxt, String chassi, String cor, String valorTxt) {
        if (placa.isEmpty() || valorTxt.isEmpty()) {
            return "Erro: Placa e Valor são obrigatórios.";
        }

        try {
            long renavam = Long.parseLong(renavamTxt);
            double valor = Double.parseDouble(valorTxt.replace(",", "."));
            
            // Para simplificar, passamos null no Modelo, mas o ideal é instanciar um
            Automovel novo = new Automovel(placa, renavam, chassi, cor, 4, 1, 0, valor, null);
            frota.add(novo);
            return "Sucesso: Veículo placa " + placa + " cadastrado!";
            
        } catch (NumberFormatException e) {
            return "Erro: Renavam e Valor devem ser numéricos.";
        }
    }

    public String buscarParaExclusao(String placa) {
        for (Automovel auto : frota) {
            if (auto.getPlacaAutomovel().equalsIgnoreCase(placa)) {
                return "Veículo encontrado:\nPlaca: " + auto.getPlacaAutomovel() + "\nCor: " + auto.getCorAutomovel();
            }
        }
        return null; // Retorna null se não achar
    }

    public boolean excluirAutomovel(String placa) {
        return frota.removeIf(auto -> auto.getPlacaAutomovel().equalsIgnoreCase(placa));
    }

    // Método que gera a matriz de dados para a JTable do AutomovelGerenciaView
    public Object[][] getDadosTabela() {
        Object[][] dados = new Object[frota.size()][4];
        for (int i = 0; i < frota.size(); i++) {
            Automovel auto = frota.get(i);
            dados[i][0] = auto.getPlacaAutomovel();
            dados[i][1] = "Modelo Padrão"; // Aqui entraria auto.getModelo().getDescricaoModelo()
            dados[i][2] = auto.getCorAutomovel();
            dados[i][3] = "R$ " + auto.getValorLocacaoAutomovel();
        }
        return dados;
    }
}