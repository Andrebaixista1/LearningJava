/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author André Felipe
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do alino: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        /*System.out.println("A nota de " + nome + " é " + nota);
        System.out.printf("A nota de %s é %f \n", nome, nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);*/
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
    }
    
}