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
public class VerificarMensagem {

    public static String VerificarMensagem(String mensagemVerificada, int linhaChave) {
        /*
         if (((mensagem.length() / linhaChave) * linhaChave) < mensagem.length()) {
         mensagemVerificada = mensagem + " ";
         }
         */
        while (((mensagemVerificada.length() / linhaChave) * linhaChave < mensagemVerificada.length())) {
           // if (((mensagemVerificada.length() / linhaChave) * linhaChave) < mensagemVerificada.length()) {
                mensagemVerificada = mensagemVerificada + " ";
            //}
        }

        return mensagemVerificada;
    }
}
