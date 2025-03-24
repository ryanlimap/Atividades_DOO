package src.main;
import java.util.Scanner;
import src.main.factory.OperacaoFactory;
import src.main.model.Operacao;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine();
        
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        try {
            // Usando Factory para criar a operação
            Operacao operacaoObj = OperacaoFactory.criarOperacao(operacao);

            // Realiza o cálculo
            double resultado = operacaoObj.calcular(num1, num2);

            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
