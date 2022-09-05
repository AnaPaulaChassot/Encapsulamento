/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Atv05 {
    public static void main(String[] args) {
        
        int a=0;
        
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o número de posições: ");
        int n = leia.nextInt();
        
        int v [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Digite o valor da posição " +i+ ": ");
            v[i] = leia.nextInt();
            
            a=a+v[i];
        }
        
        int m = a/n;
        System.out.println("A média dos valores é: "+m);
        
    }
    
}
