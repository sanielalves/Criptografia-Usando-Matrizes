/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacao;

import java.util.Scanner;

/**
 *
 * @author saniel
 */
public class MetodosBasicos {

    static int escreverInt() {
        Scanner linhaMatrizChave = new Scanner(System.in);
        int mensagemInt = linhaMatrizChave.nextInt();
        return mensagemInt;
    }

    static String escreverString() {
        Scanner linhaMatrizChave = new Scanner(System.in);
        String mensagemString = linhaMatrizChave.nextLine();
        return mensagemString;
    }
    
    static byte escreverByte(){
        Scanner linhaMatrizChave = new Scanner(System.in);
        byte mensagemString = linhaMatrizChave.nextByte();
        return mensagemString;
    }
    
    static boolean testeFecharMatriz(){
        boolean teste = false;
        return false;
    }

    static void criptografar() throws InterruptedException {
        System.out.println("\n\nPreparando Criptografia...");
        Thread.sleep(2000);
        System.out.println("Iniciando...");
        Thread.sleep(100);
        for (int cont = 0; cont <= 100; cont=cont+25) {
            System.out.println("Andamento " + cont + "%");
            Thread.sleep(50);
        }
        System.out.println("\n\n GUASE LÁ...");
    }

}
