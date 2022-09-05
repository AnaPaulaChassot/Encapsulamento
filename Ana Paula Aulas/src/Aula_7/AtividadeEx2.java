/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_7;
import javax.swing.JOptionPane;
/**
 *
 * @author Suporte
 */
public class AtividadeEx2 {
    public static void main (String[] args) {
        
        
        int qtdMacas = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Digite a quantidade de maçãs: "));
        double valor1 = 0.30;
        double valor2 = 0.25;
        double c1 = valor1*qtdMacas;
        double c2 = valor2*qtdMacas;
        
        if (qtdMacas<12){
            JOptionPane.showMessageDialog(null, "O valor da compra totalizou: " +c1);
            
        }else{
            JOptionPane.showMessageDialog(null, "O valor da compra totalizou: " +c2);
        }
            
       
        
        
        
             
        
        
    }
}
