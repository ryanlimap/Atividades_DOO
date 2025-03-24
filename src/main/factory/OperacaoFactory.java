package src.main.factory;

import src.main.model.Operacao;
import src.main.model.Soma;
import src.main.model.Subtracao;
import src.main.model.Multiplicacao;
import src.main.model.Divisao;
import java.lang.reflect.Constructor;

public class OperacaoFactory {

    public static Operacao criarOperacao(String tipo) throws Exception {
        String nomeClasse = tipo.substring(0, 1).toUpperCase() + tipo.substring(1).toLowerCase();
        String nomeCompleto = "Operacao" + nomeClasse;
        
        // Refletir para carregar a classe dinamicamente
        Class<?> clazz = Class.forName(nomeCompleto);
        Constructor<?> constructor = clazz.getConstructor();
        return (Operacao) constructor.newInstance();
    }
}
