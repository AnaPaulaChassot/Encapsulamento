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
public class Atv2 {
    public static void main (String[] args) {
        //10 alturas
        /*double i1 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a primeira altura: "));
        double i2 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a segunda altura: "));
        double i3 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a terceira altura: "));
        double i4 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a quarta altura: "));
        double i5 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a quinta altura: "));
        double i6 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a sexta altura: "));
        double i7 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a sétima altura: "));
        double i8 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a oitava altura: "));
        double i9 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a nona altura: "));
        double i10 = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a décima altura: "));
        
        double media = (i1+i2+i3+i4+i5+i6+i7+i8+i9+i10)/10;
        JOptionPane.showMessageDialog(null,"A média das alturas é: "+media);
*/
        double acumulador=0;
        int contador=1;
        
        while (contador<=10){
             double i = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite a "+contador+ "° altura"));
             contador=contador+1;
             acumulador=acumulador+i;
             }
             double media = acumulador/10;
                     
             JOptionPane.showMessageDialog(null,"A média é: "+media);
             JOptionPane.showMessageDialog(null,"A soma é: "+acumulador);
    
    }
}
