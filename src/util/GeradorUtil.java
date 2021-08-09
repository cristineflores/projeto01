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

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public double gerarSalario() {//assinatura do método - aqui vai retornar um valor doouble
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    /**
     *
     * @param args
     */
    // public static void main(String[] args) {//void não retorna
    //    GeradorUtil util = new GeradorUtil();
    //    String cpf = util.gerarCpf();
    //     System.out.println("CPF " + cpf);
    //  }
    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/0001-" + gerarNumero(2);

    }

    public String gerarTelefone() {
        return "(48) 3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public String gerarCelular() {
        return "(48) 9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public String gerarNome() {
        String[] nomes = {"Silvio", "João" , "Maria" , "Pedro" , "Lucas" , "Luiz" , "José" , "Marisa"
            , "Tania" , "Paulo" , "Jéssica" , "Antônio" , "Francisco" , "Gigio" , "Priscila"
            , "Marilia" , "Jorge" , "Maicon" , "Suelen" , "Ana"};

        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return nomes[indice] + " " + gerarSobrenome();
        
    }
    private String gerarSobrenome(){// é private para auxiliar outro método
         String[] sobreNomes = {"Silva", "Flores" , "Ranger" , "Almeida" , "Oliveira" , "Cunha" , "Abravanel" , "Souza"
            , "Rocha" , "Pires" , "Moura" , "Santos" , "Zen" , "Stark" , "Peixes"
            , "Fish" , "Smith" , "Tango" , "Carvalho" , "Pereira"};
         int tamanhoLista = sobreNomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return sobreNomes[indice];
        
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String nome = util.gerarNome();
        System.out.println("Nome " + nome);
    }
}
