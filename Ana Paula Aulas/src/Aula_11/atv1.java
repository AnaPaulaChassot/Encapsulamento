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
public class atv1 {

    public static void main(String[] args) {

        int v[] = new int[3];

        for (int i = 0; i < 3; i++) {

            v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição [" + i + "] do vetor"));

        }
       

        
    }

}
