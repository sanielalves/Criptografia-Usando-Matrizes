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
public class MatrizChave extends MetodosBasicos{

    static byte[][] ConstrutorMatrizChaveBidimensional(int quantLinha, int quantColuna) {

        byte matrizChave[][] = new byte[quantLinha][quantColuna];
        for (int contRow = 0; contRow < quantLinha; contRow++) {
            for (int contCols = 0; contCols < quantColuna; contCols++) {
                System.out.print("Posicão " + (contRow + 1) + (contCols + 1) + " -> ");
                matrizChave[contRow][contCols] = escreverByte();
            }
        }
        //Imprimir matriz Chave
        System.out.println("\nMATRIZ CHAVE DEFINIDA PARA ESTA CRIPTOGRAFIA:");
        for (int contRow = 0; contRow < quantLinha; contRow++) {
            System.out.println("\n");
            for (int contCols = 0; contCols < quantColuna; contCols++) {
                System.out.print("\t" + matrizChave[contRow][contCols]);
            }
        }
        return matrizChave;
    }
}
