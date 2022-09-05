/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Exercicio_4 {
    public static void main (String[] args) {
        
        double a = 0;
        int c = 1;
        
        int  q = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite a quatidade de produtos: "));
        
        while (c<=q){
        
        double v = Double.parseDouble(JOptionPane.showInputDialog (null, "Escreva o valor do produto: "));
        a=a+v;
        c=c+1;
        
        }
        
        JOptionPane.showMessageDialog(null,"A soma dos valores é: "+a);
    }
}
