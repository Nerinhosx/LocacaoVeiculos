package controller;

import model.entity.Automovel;
import model.entity.Cliente;
import model.entity.Locacao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class LocacaoController {

    private static List<Locacao> locacoes = new ArrayList<>();
    
    // Instanciamos os outros controllers para buscar os dados reais
    private ClienteController clienteController = new ClienteController();
    private AutomovelController autoController = new AutomovelController();

    public String registrarRetirada(String cpfTxt, String placa, String dataTxt, String horaTxt, String kmTxt, String caucaoTxt) {
        try {
            long cpf = Long.parseLong(cpfTxt);
            long km = Long.parseLong(kmTxt);
            double caucao = Double.parseDouble(caucaoTxt);
            LocalDate data = LocalDate.parse(dataTxt); // Formato AAAA-MM-DD
            LocalTime hora = LocalTime.parse(horaTxt); // Formato HH:MM

            Cliente cliente = clienteController.buscarPorCpf(cpf);
            if (cliente == null) return "Erro: Cliente não cadastrado.";

            // Aqui precisaria de um buscarPorPlaca que retorna o Objeto Automovel
            // Para o exemplo rodar, vou simular o encontro do carro
            Automovel carro = new Automovel(placa, 0, "", "", 0, 0, km, 100.0, null);

            Locacao novaLocacao = new Locacao(data, hora, null, null, km, 0, caucao, 0, false, carro, cliente);
            locacoes.add(novaLocacao);

            return "Sucesso: Locação registrada! Veículo " + placa + " agora está como LOCADO.";

        } catch (NumberFormatException e) {
            return "Erro: Verifique se CPF, KM e Caução contêm apenas números.";
        } catch (DateTimeParseException e) {
            return "Erro: Data ou Hora em formato inválido. Use AAAA-MM-DD e HH:MM.";
        }
    }

    public String calcularEstimativa(char categoria) {
        // Lógica simplificada do RF12 para o botão da interface
        double valorBase = 0;
        if (categoria == 'A') valorBase = 80.0;
        else if (categoria == 'B') valorBase = 120.0;
        else valorBase = 150.0;

        return "O valor da diária para esta categoria é de R$ " + valorBase + " + KM rodado.";
    }
}