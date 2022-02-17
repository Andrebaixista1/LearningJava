/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author BRM3907
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o 2º número: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        
        if (m>9){
            System.out.println("Parabéns pequeno gafanhoto!");
        }
        
       
        
        
    }
    
}
