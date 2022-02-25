/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author BRM3907
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null, "Olá mundo!", "Boas vindas!", JOptionPane.WARNING_MESSAGE);
        int n, c=0, p=0, i=0,up=0,m=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número <br><i>(0 para sair)</i> </html>"));
            c++;
            
            if (n % 2 == 0){
                p++;
            } else {
                i++;
            }
            
            if (n > 100){
                up++;
            }
            
            
            
            
            
        } while(n != 0);
        
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br>" + "Total de Valores: " + (c-1) + "<br>Total de Pares: "
                + p + "<br>Total de impares: "+ i + "<br>Acima de 100: " + up + "<br>Média dos valores" +"</html>");
    }
    
}
