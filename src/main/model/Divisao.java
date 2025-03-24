package src.main.model;
public class Divisao implements Operacao {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }
}
