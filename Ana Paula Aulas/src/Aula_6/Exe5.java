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
public class Exe5 {
   
    public static void main(String[] args) {
        
    String nomeVendedor = JOptionPane.showInputDialog(null, "Digite seu Nome: ");
    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o salário: "));
    String mes = JOptionPane.showInputDialog(null, "Digite o mês atual: ");
    double vendas = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valkor das vendas do mês: "));
    double acrecimovendas = (vendas*0.12)+salario;
    JOptionPane.showInputDialog(null, 
            "O valor do Salário com acrécimo é: "+acrecimovendas);
    
    System.exit(0);
}
}