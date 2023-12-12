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
   
        int n1 , n2 , n3 , m;
        Scanner tc =  new Scanner (System.in);
        
        System.out.println("Qual é a primeira nota do aluno :");
        n1 = tc.nextInt();
        System.out.println("Qual e a segunda nota do aluno: ");
        n2 = tc.nextInt();
        System.out.println("Qual e a terceira nota do aluno: ");
        n3 = tc.nextInt();
        
       m = (n1+n2+n3)/3;
        System.out.println("A nota do aluno e: "+m);
        
        if (m>=7) { System.out.println("O aluno esta aprovado");
        }
        else { System.out.println("O aluno esta reprovado");
            
        }
    }
}
