/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01s;

/**
 *
 * @author BRM3907
 */
public class Contador01s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cc = 1;
        while (cc<=4){
            System.out.println("Cambalhota - " + cc);
            cc++;
        }*/
        
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota - " + cc);
            
            
        }
    }
    
}
