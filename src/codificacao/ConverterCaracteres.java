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
public class ConverterCaracteres {

    public static int converterCaracteres(String mensagem, char letra) {

        char vetorCaracteres[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                                            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '-', ' ',
                                            '?', '!','%','@','#','(',')','[',']','{','}','A','B','C','D','E','F','H',
                                            'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1',
                                            '2','3','4','5','6','7','8','9','0'};
        for (int contMensagem = 0; contMensagem < mensagem.length(); contMensagem++) {
            int posicao = 1;
            for (int contVetor = 0; contVetor < vetorCaracteres.length; contVetor++) {
                if (letra == vetorCaracteres[contVetor]) {
                    //return contMensagem+1;
                    return posicao;
                }
                posicao++;
            }
        }
        return (0);

        /*
         if ((letra == 'a')||(letra == 'A')) {
         return 1;
         }
         if ((letra == 'b')||(letra == 'B')) {
         return 2;
         }
         if ((letra == 'c')||(letra == 'C')) {
         return 3;
         }
         if ((letra == 'd')||(letra == 'D')) {
         return 4;
         }
         if ((letra == 'e')||(letra == 'E')) {
         return 5;
         }
         if ((letra == 'f')||(letra == 'F')) {
         return 6;
         }
         if ((letra == 'g')||(letra == 'G')) {
         return 7;
         }
         if ((letra == 'h')) {
         return 8;
         }
         if (letra == 'i') {
         return 9;
         }
         if (letra == 'j') {
         return 10;
         }
         if (letra == 'k') {
         return 11;
         }
         if (letra == 'l') {
         return 12;
         }
         if (letra == 'm') {
         return 13;
         }
         if (letra == 'n') {
         return 14;
         }
         if (letra == 'o') {
         return 15;
         }
         if (letra == 'p') {
         return 16;
         }
         if (letra == 'q') {
         return 17;
         }
         if (letra == 'r') {
         return 18;
         }
         if (letra == 's') {
         return 19;
         }
         if (letra == 't') {
         return 20;
         }
         if (letra == 'u') {
         return 21;
         }
         if (letra == 'v') {
         return 22;
         }
         if (letra == 'w') {
         return 23;
         }
         if (letra == 'x') {
         return 24;
         }
         if (letra == 'y') {
         return 25;
         }
         if (letra == 'z') {
         return 26;
         }
         if (letra == '.') {
         return 27;
         }
         if (letra == ',') {
         return 28;
         }
         if (letra == '-') {
         return 29;
         }
         if (letra == ' ') {
         return 30;
         } else {
         return (0);
         }
         */
    }
}
