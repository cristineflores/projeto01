/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author marie
 */
public class Teste {

    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
// XX. XXX. XXX/0001-XX

    }
}
