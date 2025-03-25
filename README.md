# Calculadora em Java utilizando Factory e Reflection

## 📝 Descrição

Este projeto implementa uma calculadora em Java que utiliza os padrões **Factory Method** e **Reflection** para criar e gerenciar operações matemáticas básicas dinamicamente. A abordagem permite adicionar novas operações sem modificar o código existente, seguindo o princípio **Open/Closed** do SOLID.

## ✨ Funcionalidades

- Operações básicas (Soma, Subtração, Multiplicação, Divisão)
- Extensibilidade para novas operações via Reflection
- Fábrica (Factory) para criação dinâmica de operações
- Tratamento de exceções para operações inválidas

## ▶️ Como Executar

1. Clone o repositório
2. Compile o projeto:
   ```bash
   javac src/main/java/calculadora/*.java src/main/java/calculadora/operacoes/*.java
   ```
3. Execute a calculadora:
   ```bash
   java -cp src/main/java calculadora.Calculadora
   ```

## 🧪 Testes

Os testes podem ser executados com:
```bash
javac -cp src/test/java src/test/java/*.java
java -cp src/test/java NomeDaClasseDeTeste
```

## 📌 Observações

- O padrão Factory centraliza a criação de objetos
- Reflection permite descobrir operações em runtime
- Novas operações são plugáveis sem modificar código existente
