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
public class Exercicio_6 {
    public static void main (String[] args) {
        
        
        double s = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do reajuste em porcentagem:"+
                "\n (Exemplo: 10) "));
        
        
       
       double rp = r/100;
       double reajuste = (s*rp)+s;
       
       JOptionPane.showMessageDialog(null,"O salário com reajuste é: "+reajuste);
    }
    }
    

