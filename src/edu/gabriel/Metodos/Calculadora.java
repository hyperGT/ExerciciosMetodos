package edu.gabriel.Metodos;

import java.util.Scanner;

public class Calculadora {

    private static int somar(int i, int x){
        return i + x;
    }

    private static int subtrair(int i, int x){
        return i - x;
    }
    private static int multiplicar(int i, int x){
        return i * x;
    }
    private static float dividir(float i, float x){
        return i / x;
    }

    public static void escolhaOperacao(){
        Scanner scan1 = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro numero: ");
        a = scan1.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        b = scan1.nextInt();

        System.out.println();

        int soma = somar(a, b);
        int subtracao = subtrair(a, b);
        int multiplicacao = multiplicar(a, b);
        float divisao = dividir((float) a, b);

        System.out.println("""
                Qual operação voce deseja realizar?
                --------------
                Digite 1 para Soma
                Digite 2 para Subtração
                Digite 3 para Multiplicação
                Digite 4 para Dividir
                Digite 5 para mostrar todas as Operações
                --------------""");

        int numero = scan1.nextInt();
        switch (numero) {
            case 1 -> System.out.println("Resultado da soma: " + soma);
            case 2 -> System.out.println("O resultado da subtração é: " + subtracao);
            case 3 -> System.out.println("O resultado da multiplicação é: " + multiplicacao);
            case 4 -> System.out.println("O resultado da divisão é: " + divisao);
            case 5 -> System.out.println("[" + numero + "]"
                    + "\nResultado da Soma: " + soma
                    + "\nResultado da Subtração: " + subtracao
                    + "\nResultado da Multiplicação: " + multiplicacao
                    + "\nResultado da Divisão: " + divisao);
            default -> {
                System.out.println("[" + numero + "]");
                System.out.println("Nenhuma operação será feita");
            }
        }
    }
}
