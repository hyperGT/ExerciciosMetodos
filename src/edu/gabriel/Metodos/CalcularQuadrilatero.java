package edu.gabriel.Metodos;

import java.util.Scanner;

public class CalcularQuadrilatero {

    public static void operacoesMat(){

        Scanner scan2 = new Scanner(System.in);

        System.out.println("""
                Qual quadrilátero o usuário deseja calcular a área?
                -------------
                1 - Quadrado
                2 - Trapézio
                3 - Retângulo
                ------------""");

        System.out.print("Insira o número correspondente: ");
        int numero1 = scan2.nextInt();
        switch (numero1) {
            case 1 -> {
                System.out.println("\n----------------");
                System.out.println("Calculando Área do Quadrado" +
                        "\n----------------------");
                double ladoQuadrado;
                System.out.print("Insira o valor do Lado do Quadrado: ");
                ladoQuadrado = scan2.nextDouble();
                double areaQuadrado = calculaArea(ladoQuadrado); //exemplo de sobrecarga
            }
            case 2 -> {
                System.out.println("\n----------------");
                System.out.println("Calculando Área do Trapézio" +
                        "\n----------------------");
                int baseMaior,baseMenor,altura;
                System.out.print("Base Maior: ");
                baseMaior = scan2.nextInt();
                System.out.print("Base Menor: ");
                baseMenor = scan2.nextInt();
                System.out.print("Altura: ");
                altura = scan2.nextInt();
                System.out.println("==========================");
                double areaTrapezio = calculaArea(baseMaior,baseMenor,altura); //exemplo de sobrecarga
            }
            case 3 -> {
                System.out.println("\n----------------");
                System.out.println("Calculando Área do Retângulo" +
                        "\n----------------------");
                int ladoMaior, ladoMenor;
                System.out.print("Lado Maior: ");
                ladoMaior = scan2.nextInt();
                System.out.print("Lado Menor: ");
                ladoMenor = scan2.nextInt();
                System.out.println("--------------------");
                int areaRetangulo = calculaArea(ladoMaior, ladoMenor);
            }
            default -> System.out.println("Nenhuma operação será feita");
        }

    }

    private static double calculaArea(double L){

        double A = Math.pow(L,2); // eleva L ao quadrado

        System.out.println("Fórmula: A = LxL");

        System.out.println((int) L + "x" + (int) L + " = A");

        System.out.println("Área do quadrado = " + (int) A);
        return A;
    }

    private static int calculaArea(int B, int b, int h){


        int A = (B+b) * h / 2;

        System.out.println("Fórmula: A = (B+b).h/2");
        System.out.println("A = " + "("+B + "+" + b + ")"+ "x" + h + "/2");

        System.out.println("Área do trapézio = " + A);

        return A;
    }

    private static int calculaArea(int b, int h){

        int A = b * h;

        System.out.println("Fórmula: A = bxh");
        System.out.println("A = " + b + "x" + h);

        System.out.println("Área do Retângulo = " + A);

        return A;
    }
}
