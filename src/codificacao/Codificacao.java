/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacao;

import static codificacao.ConverterCaracteres.converterCaracteres;
import static codificacao.MatrizChave.ConstrutorMatrizChaveBidimensional;
import static codificacao.MatrizMensagemConvertida.construtorMatrizMensagemBidimensional;
import static codificacao.VerificarMensagem.VerificarMensagem;
import static codificacao.MatrizResultado.MatrizResultado;

/**
 *
 * @author saniel
 */
public class Codificacao extends MetodosBasicos {

    public static void main(String[] args) throws InterruptedException {

        // Escrever mensagem
        System.out.print("INFORME UMA MENSAGEM PARA CRIPTOGRAFAR ->  ");
        String mensagem = escreverString();

        // Definindo tamanho da matrizChave
        System.out.print("\nDEFINA O TAMANHO DA MATRIZ CHAVE PARA ESTA CRIPTOGRAFIA (A MATRIZ SERÁ QUADRADA)-> ");
        int linhaChave = escreverInt();
        int colunaChave = linhaChave;

        // Preenchendo matrizChave com valores
        System.out.println("\nDEFINA VALORES PARA ESTA MATRIZ CHAVE\n");
        byte[][] MatrizChave = ConstrutorMatrizChaveBidimensional(linhaChave, colunaChave);

        // Verificando e corrigindo mensagem para evitar problemas na construção da matrizMensagem
        String mensagemVerificada = VerificarMensagem(mensagem, linhaChave);

        // Convertendo caracteres da mensagem em números representativos
        int vetorMensagemConvertida[] = new int[mensagemVerificada.length()]; //criando vetor e deixando do tamanho da mensagem
        for (int cont = 0; cont < mensagemVerificada.length(); cont++) { // conta a quantidade de caracteres de uma string e usa como condição de parada
            vetorMensagemConvertida[cont] = (int) converterCaracteres(mensagem, mensagemVerificada.charAt(cont)); //criando vetor das letras convertidas em números
            //System.out.println(mensagemVerificada.charAt(cont) + " -> " + vetorMensagemConvertida[cont]); //Verifica apenas um caractere dentre de uma string por base em sua posição no vetor.
        }

        // Preenchendo matrizMensagem com valores convertidos
        byte[][] MatrizMensagem = construtorMatrizMensagemBidimensional(mensagem, colunaChave, mensagemVerificada.length() / linhaChave, vetorMensagemConvertida);  // (mensagem.length()/linha) define multiplos para as linhas da matriz;

        //Multiplicando matrizChave com matrizMensagem
        System.out.println("\n\nMATRIZ RESULTADO");
        MatrizResultado(MatrizChave, MatrizMensagem, colunaChave, mensagemVerificada.length() / linhaChave);
        System.out.println("\n\nDesenvolvido por Saniel Barros Alves.");

    }
}

/*
        
 public static void main(String[] args) throws InterruptedException {

 System.out.println("INFORME UMA MENSAGEM PARA CRIPTOGRAFAR.");
 String mensagem = escreverString();
        
 //Convertendo caracteres em números representativos
 int vetorMensagemConvertida[] = new int[mensagem.length()]; //criando vetor e deixando do tamanho da mensagem
 for (int cont = 0; cont < mensagem.length(); cont++){ // conta a quantidade de caracteres de uma string e usa como condição de 
 vetorMensagemConvertida[cont] = converterCaracteres(mensagem.charAt(cont)); //criando vetor das letras convertidas em números
 System.out.println(mensagem.charAt(cont) + " -> " + vetorMensagemConvertida[cont]); //Verifica apenas um caractere dentre de uma string por base em sua posição no vetor.
 }
        
 //Definindo tamanho da matriz chave
 System.out.println("\nDEFINA O TAMANHO DA MATRIZ CHAVE PARA ESTA CRIPTOGRAFIA");
 System.out.print("Quantidade de linhas -> ");
 int linha = escreverInt();
 System.out.print("Quantidade de colunas -> ");
 int coluna = escreverInt();
 eatrizChave ChaveCriptografia = new eatrizChave(linha, coluna);
        
 //Preenchendo matriz chave com valores
 System.out.println("\nDEFINA VALORES PARA ESTA MATRIZ CHAVE");
 ChaveCriptografia.ConstrutorMatrizBidimensional();
        
 //Iniciando criptografia
 System.out.println("\n\nA MENSAGEM ABAIXO SERÁ CRIPTOGRAFADA... \n" + mensagem);
 criptografar();
 }

 */
