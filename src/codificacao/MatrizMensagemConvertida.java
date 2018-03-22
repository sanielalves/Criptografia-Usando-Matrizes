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
public class MatrizMensagemConvertida {

    /*
     * MatrizMensagem tem a quantidade de linhas iguais a quantidade de linhas da matrizChave, sendo que a quantidade
     * de colunas e definida pela divisão dessa ultima com a quantidade de caracteres da mensagem.
     */
    static byte[][] construtorMatrizMensagemBidimensional(String mensagem, int quantlinhasMatriz, int multiploColunas, int vetorMensagemConvertidas[]) {
        /*
         * if (multiploColunas*quantlinhasMatriz < mensagem.length()){
         * vetorMensagemConvertidas[mensagem.length()+1] = 30;
         * multiploColunas = multiploColunas + (mensagem.length()% quantlinhasMatriz);
         * }
         */
        byte matrizMensagemConvertida[][] = new byte[quantlinhasMatriz][multiploColunas], posicao = 0;

        for (int contRow = 0; contRow < quantlinhasMatriz; contRow++) {
            for (int contCols = 0; contCols < multiploColunas; contCols++) {
                matrizMensagemConvertida[contRow][contCols] = (byte) vetorMensagemConvertidas[posicao];
                posicao++;
            }
        }

        System.out.println("\n\nMATRIZ CORRESPONDENTE A MENSAGEM DIGITADA:");
        System.out.println("Mensagem digitada: " + mensagem);
        for (int contRow = 0; contRow < quantlinhasMatriz; contRow++) {
            System.out.println("\n");
            for (int contCols = 0; contCols < multiploColunas; contCols++) {
                System.out.print("\t" + matrizMensagemConvertida[contRow][contCols]);
            }
        }

        /*
         if (multiploColunas % 2 == 0) {
         System.out.println("\n\n   ERRO 101 - Solicitação mal sucedida. Alguns valores podem ter sido subtraidos da matriz.");
         }
         */
        return matrizMensagemConvertida;
    }
}
