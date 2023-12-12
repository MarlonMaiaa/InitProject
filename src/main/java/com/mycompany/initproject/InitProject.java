/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.initproject;

import java.util.Scanner;

/**
 *
 * @author Marlon
 */
public class InitProject {

    public static void main(String[] args) {
   
       // Atributos
       float n1 =0 ,n2 =0  ,n3 =0,m;
       String n;


       // leitor Scanner
       Scanner tc = new Scanner (System.in);
       // Abstracao
       System.out.println("Qual e o nome do aluno: ");
       n = tc.nextLine();

       System.out.println(" Qual e a primeira nota do aluno "+n+ ":");
       n1 = tc.nextFloat();

       System.out.println("Qual e a segunda nota do aluno "+n+":");
       n2 = tc.nextFloat();

       System.out.println("Qual e a terceira nota do aluno"+n+":");
       n3 = tc.nextFloat();
       // calculo
      m =  (n1+n2+n3)/3;
      if (m>=7 && m <= 9) {
          System.out.printf("Parabens ao aluno  "+n+" esta aprovado , com a  nota %.1f  ",m );}
       else if (m>=9) {
           System.out.printf("Parabens "+n+" sua nota foi excelente %.1f",m);
       }
      if (m <7) {
          System.out.printf ("Infelizmente o aluno "+n+" nao alcançou a nota minima , nota: %.1f ",m);
      }
    }
}
