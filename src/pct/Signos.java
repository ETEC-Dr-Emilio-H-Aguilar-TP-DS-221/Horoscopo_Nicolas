/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author manager
 */
public class Signos {
    
    public static void main(String[] args) {
         //variaveis
        int dia, mes;
        
        //Criação e Instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //apresentação
        System.out.println("\n\t\t -- Indicador de Estação do Ano --\n");
        
        //entrada
        System.out.print("Informe o Dia: ");
        dia = entrada.nextInt();
        
        System.out.print("Informe o Mes: ");
        mes = entrada.nextInt();
        
        //processamento & saida
        
        if ((mes <= 12) && (mes >= 1)) {
            if ((dia <= 31) && (dia >= 1)) {
                System.out.println("Seu Signo é:");
                if (((mes == 3) && (dia >= 21)) || ((mes == 4) && (dia <= 19))) {
                    System.out.println("Áries");
                } else if (((mes == 4) && (dia >= 20)) || ((mes == 5) && (dia <= 20))) {
                    System.out.println("Touro");
                } else if (((mes == 5) && (dia >= 21)) || ((mes == 6) && (dia <= 21))) {
                    System.out.println("Gêmeos");
                } else if (((mes == 6) && (dia >= 22)) || ((mes == 7) && (dia <= 22))) {
                    System.out.println("Câncer");
                } else if (((mes == 7) && (dia >= 23)) || ((mes == 8) && (dia <= 22))) {
                    System.out.println("Leão");
                } else if (((mes == 8) && (dia >= 23)) || ((mes == 9) && (dia <= 22))) {
                    System.out.println("Virgem");
                } else if (((mes == 9) && (dia >= 23)) || ((mes == 10) && (dia <= 22))) {
                    System.out.println("Libra");
                } else if (((mes == 10) && (dia >= 23)) || ((mes == 11) && (dia <= 21))) {
                    System.out.println("Escorpião");
                } else if (((mes == 11) && (dia >= 22)) || ((mes == 12) && (dia <= 21))) {
                    System.out.println("Sagitário");
                } else if (((mes == 12) && (dia >= 22)) || ((mes == 1) && (dia <= 19))) {
                    System.out.println("Capricórnio");
                } else if (((mes == 1) && (dia >= 20)) || ((mes == 2) && (dia <= 18))) {
                    System.out.println("Aquário");
                } else if (((mes == 2) && (dia >= 19)) || ((mes == 3) && (dia <= 20))) {
                    System.out.println("Peixes");
                } 
            } else {
                System.out.println("Dia Invalido");
            }
        } else {
             System.out.println("Mês Invalido");
        }
    }
    
}
