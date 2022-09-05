/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Exe3 {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        
        if(idade>15){
            JOptionPane.showMessageDialog(null, "É possível fazer aula de Musculação");
        }else {
            JOptionPane.showMessageDialog(null, "Não é possível fazer aula de Musculação");
        
            int sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite sua sexualidade: "
                + "\n1 - Feminino" + "\n2 - Masculino"));
        
     
            
            switch (sexo) {
                
                case 1: {
                    JOptionPane.showMessageDialog(null, "É possível fazer aula de Ginástica");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "É possível fazer aula de Futebol");
                
                break;
                }
            default: { JOptionPane.showMessageDialog(null, "Valor Incorreto");
                
                
            }
            }
        }
            

    }
}

