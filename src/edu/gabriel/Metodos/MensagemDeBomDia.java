package edu.gabriel.Metodos;

import java.time.LocalTime;

public class HoraDoDia {

    public static void mostraMensagem(){

        // cria um objeto LocalTime com a hora atual
        LocalTime horaAtual = LocalTime.now();

        // obtém a hora a dia
        int hora = horaAtual.getHour();

        if (hora < 12 && hora >= 4){
            System.out.println("Bom Dia!");
        }
        if (hora >= 12 && hora <= 18){
            System.out.println("Boa Tarde!");
        }
        if (hora > 18){
            System.out.println("Boa Noite!");
        }
    }
}
