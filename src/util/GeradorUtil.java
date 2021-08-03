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
public class GeradorUtil {

    /**
     * java doc - comentário Retorna um valor String conforme a quantidade de
     * número solicitado
     *
     * @param qtd
     * @return
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;//isso pra pegar os zeros à esquerda.
        }
        return senha;

    }
    public String gerarCpf(){
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }    
        
    public double gerarSalario() {//assinatura do método - aqui vai retornar um valor doouble
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public static void main(String[] args) {//void não retorna
        GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarCpf();
        System.out.println("CPF " + cpf);

        
    }

}
