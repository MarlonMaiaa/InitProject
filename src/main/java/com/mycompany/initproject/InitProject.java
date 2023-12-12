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
   
        float n1 , n2 , n3 , m;
        Scanner tc =  new Scanner (System.in);
        
        System.out.println("Qual é a primeira nota do aluno: ");
        n1 = tc.nextFloat();
        System.out.println("Qual e a segunda nota do aluno: ");
        n2 = tc.nextFloat();
        System.out.println("Qual e a terceira nota do aluno: ");
        n3 = tc.nextFloat();
        
       m = (n1+n2+n3)/3;
        System.out.println("A nota do aluno e: "+m);
        
        if (m>=7) { System.out.println("O aluno esta aprovado com a nota "+ m);
        }
        else { System.out.println("O aluno esta reprovado com a nota "+m);
            
        }
    }
}
