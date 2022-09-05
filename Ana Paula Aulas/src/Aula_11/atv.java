/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11;
import javax.swing.JOptionPane;
/**
 *
 * @author Suporte
 */
public class atv {
    public static void main(String[] args) {
        
         
        
        int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: "));
        
        int v[] = new int[p];
       
        for (int i = 0; i<v.length ; i++){
        
        v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição "+"["+i+"] do vetor"));
       
       
        }
        for (int i = 0; i<v.length ; i++){
        
       JOptionPane.showMessageDialog(null, "Posição "+"["+i+"] do vetor: " +v[i]);
       
        }
    }
    
}
