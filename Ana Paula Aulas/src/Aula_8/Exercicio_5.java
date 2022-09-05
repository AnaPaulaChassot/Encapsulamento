/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;
import javax. swing.JOptionPane;
/**
 *
 * @author Suporte
 */
public class Exercicio_5 {
    public static void main (String[] args) {
        
        int  v = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite um número inteiro: "));
        int x=v-1;
        JOptionPane.showMessageDialog(null,"Seu antecessor é: "+x);
    }
}
