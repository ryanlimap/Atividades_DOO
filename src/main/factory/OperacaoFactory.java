package src.main.factory;

import src.main.model.Divisao;
import src.main.model.Multiplicacao;
import src.main.model.Operacao;
import src.main.model.Soma;
import src.main.model.Subtracao;

public class OperacaoFactory {
    public static Operacao criarOperacao(String tipo) {
        return switch (tipo.trim()) {
            case "+" -> new Soma();
            case "-" -> new Subtracao();
            case "*" -> new Multiplicacao();
            case "/" -> new Divisao();
            default -> throw new IllegalArgumentException("Operação inválida: " + tipo);
        };
    }
}