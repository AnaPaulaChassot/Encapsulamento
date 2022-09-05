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
public class Exe5 {
    public static void main(String[] args) {
        
        int a[] = new int [10];
        
         int ct=0;
         double mh = 0;
         int cont = 0;
        Scanner leia = new Scanner (System.in);
        
        for(int c=0;c<10;c++){
            System.out.println("Digite a "+c+"° altura: ");
            a[c]=leia.nextInt();
            System.out.println("Digite 1 para masculine ou 2 para feminino");
            int s = leia.nextInt();
            
            switch(s){
                case 1:
           
                cont++;
                 mh = a[c]/c;
                
                case 2:
            System.out.println("Digite a "+c+"° altura: ");
            a[c]=leia.nextInt();
            
                ct++;
            }
            
            
            
        }
        System.out.println("a média de altura dos homens é "+mh);
        System.out.println("A quantidade de mulheres é "+ct);
    }
}
