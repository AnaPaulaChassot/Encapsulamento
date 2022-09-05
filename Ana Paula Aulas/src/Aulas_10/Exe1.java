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
public class Exe1 {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha: \n1 - Curitiba"
                + "\n2 - Porto Alegre" + "\n3 - Florianópolis" + "\n4 - São Paulo"
                + "\n5 - Rio de Janeiro" + "\n6 - Vitória"+ "\n7 - Belo Horizonte"
                + "\n8 - Campo Grande" + "\n9 - Cuiabá" + "\n10 - Goiânia" + "\n11 - Brasília"
                + "\n12 - Palmas" + "\n13 - Boa Vista" + "\n14 - Porto Velho" + "\n15 - Belém"
                + "\n16 - Maunaus" + "\n17 - Macapá" + "\n18 - Rio Branco" + "\n19 - Aracaju"
                + "\n20 - Natal" + "\n21 - Teresina" + "\n22 - Recife" + "\n23 - João Pessoa"
                + "\n24 - São Luíz" + "\n25 - Fortaleza" + "\n26 - Salvador" + "\n27 - Maceió"));

        
        switch (x) {
            case 1:
            case 2:
            case 3: {
                JOptionPane.showMessageDialog(null,"Essa capital pertence a região Sul");

                break;
            }

            case 4:
            case 5:
            case 6: 
            case 7:{
                JOptionPane.showMessageDialog(null,"Essa capital pertence a região Sudeste");

                break;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                JOptionPane.showMessageDialog(null,"Essa capital pertence a região Centro-Oeste");

                break;
                    }
            
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:{
                JOptionPane.showMessageDialog(null,"Essa capital pertence a região Norte");

                break;
                    }
            
            
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:{
                JOptionPane.showMessageDialog(null,"Essa capital pertence a região Nordeste");

                break;
                    }
            
            default: {
                JOptionPane.showMessageDialog(null,"Fora do intervalo!");
            }
        }
    }

}
