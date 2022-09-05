/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana.paula.prova_recup;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Exe4 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celcius: ");
        double c = leia.nextDouble();
        
        double f = c*1.8+32;
        double k = c+273.15;
        double Re=c*0.8;
        double Ra=c*1.8+32+459.67;
        
        System.out.println("Os "+c+ " graus celcius é igual a:"
        + "\n"+f +" Fahrenheit"
                + "\n"+k +" Kelvin"
                + "\n"+Re +" Réaumur"
                + "\n"+Ra +" Rankine" );
        
        
    }
    
}
