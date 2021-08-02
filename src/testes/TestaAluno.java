/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author marie
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        aluno.setNome(nome);
        
        System.out.println("Nome: " + aluno.getNome());
        
        
//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno:");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//        aluno.telefone = JOptionPane.showInputDialog("Qual o telefone? ");
//        aluno.logradouro = JOptionPane.showInputDialog("Digite o logradouro");
//        aluno.numero = JOptionPane.showInputDialog("Digite o numero");
//        aluno.bairro = JOptionPane.showInputDialog("Digite o bairro");
//        aluno.trabalha = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite o bairro"));
//
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));
//        
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf: "));
        
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome
//                + " " + aluno.sobrenome + "\nIdade" + aluno.idade + "\nSalário: " 
//                + aluno.salario +"\nCPF: " + aluno.cpf + "\nTelefone: " + aluno.telefone 
//                + "\nLogradouro: " + aluno.logradouro + "\nNúmero: " + aluno.numero + "\nBairro: " + aluno.bairro + "\nTrabalha? " + aluno.trabalha);
    }

}
//Os tipos primitivos são boolean, byte, char, short, int, long, float e double. 
//Os tipos por referência, são classes que especificam os tipos de objeto Strings, Arrays Primitivos e Objetos.
