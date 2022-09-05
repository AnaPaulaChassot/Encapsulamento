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
public class Exe4 {
    
    public static void main(String[] args) {
    
    double valor = Double.parseDouble(JOptionPane.showInputDialog (null, "Digite o valor: "));
    
    double reajuste = (valor*0.15)+valor;
    JOptionPane.showInputDialog(null, "O valor do reajuste é: "+reajuste);
    
}
    
    

    
}
