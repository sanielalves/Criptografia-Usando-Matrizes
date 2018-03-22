/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacao;

/**
 *
 * @author saniel
 */
public class MatrizResultado {

    static int MatrizResultado(byte[][] MatrizChave, byte[][] MatrizMensagem, int colunaChave, int colunaMensagem) {

        int MatrizResultado[][] = new int[colunaChave][colunaMensagem];
        int soma = 0;
        int cont2 = 0;

        for (int cont = 0; cont < colunaChave; cont++) { //Conta linha da matrizChave
            int i = 0;
            System.out.println("\n");
            while (i < colunaMensagem) { //Conta Colunas da matrizMensagem
                cont2=0;
                for (cont2 = 0; cont2 < colunaChave; cont2++) { //Conta linhas da matrizMensagem
                    soma = soma + MatrizChave[cont][cont2] * MatrizMensagem[cont2][i];
                }
                System.out.print("\t" + soma);
                soma = 0;
                i = i + 1;
            }
        }
        return 0;
    }
}
