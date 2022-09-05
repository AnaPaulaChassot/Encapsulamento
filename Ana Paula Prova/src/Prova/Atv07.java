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
public class Atv07 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da compra: ");
        double v = leia.nextDouble();
        
        if(v>=5000){
            double r = v*1.2;
            System.out.println("Valor sem desconto: "+v
                    + "\nValor do desconto: 20%"
                    + "\nValor com desconto: "+r);
        }else{
            double r = v*1.15;
            System.out.println("Valor sem desconto: "+v
                    + "\nValor do desconto: 15%"
                    + "\nValor com desconto: "+r);
        }
        
    }
    
}