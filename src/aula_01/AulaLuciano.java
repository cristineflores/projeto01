/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_01;

import java.util.Scanner;


/**
 *
 * @author marie
 */
public class AulaLuciano {

    public static void main(String[] args) {
        int qtdMediasomadas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja calcular? ");
        int turma = sc.nextInt();

        for (int i = 0; i < turma; i++) {
            System.out.println("Digite o nome do aluno: ");
            String aluno = sc.next();

            System.out.println("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + aluno + "foi" + media);

            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("");
            qtdMediasomadas++;
        }
        System.out.println("Você calculou a média de " + qtdMediasomadas + "Alunos");
        System.out.println("FIM");
        
        sc.close();
    }
}

