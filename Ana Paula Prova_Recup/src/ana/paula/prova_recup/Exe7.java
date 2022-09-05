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
public class Exe7 {
    public static void main(String[] args) {
        
        String v[]= new String[6];
        
        Scanner leia=new Scanner(System.in);
        
       for(int c=0;c<7;c++){
           System.out.println("Digite o nome da "+c+"° fruta");
           v[c]=leia.nextLine();
           
       }
       
        System.out.println("O nome das frutas em ordem inversa é: ");
        
       for(int c=7;c>0;c--){
           System.out.print(v[c]+" ,");
       }
    }
    
}
