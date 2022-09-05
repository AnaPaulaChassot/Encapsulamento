/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_6;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Exe1 {
     public static void main(String[] args) {
         
         double a = Double.parseDouble(JOptionPane.showInputDialog(null, 
                 "Digite o primeiro valor; ") );
         double b = Double.parseDouble(JOptionPane.showInputDialog(null, 
                 "Digite o segundo valor:"));
         
         double soma = a+b;
         double sub = a-b;
         double mult = a+b;
         double div = a/b;
         
         System.out.print ("A soma é: " + soma+
                 "\nA subtração é: " +sub+
                 "\nA multiplicação é: " +mult+
                 "\nA divisão é: " +div);
                 
         
                        
         
         
     }
}
