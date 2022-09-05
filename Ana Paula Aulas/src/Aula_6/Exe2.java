/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_6;
// import java.util.Scanner; //biblioteca importada Scanner
import javax.swing.JOptionPane;
/**
 *
 * @author Suporte
 */
public class Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double contaAluguel = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Aluguel: "));
        double contaLuz = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Luz: "));
        double contaInternet = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Internet: "));
        double contaCombustivel = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Combustível: "));
        double contaCondominio = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Condomínio: "));
        double contaComida = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Comida: "));
        double contaOutros = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Digite o valor da conta de Outros Gastos: "));
        double salario = 2889.60;
        
        double sobra = salario-contaAluguel-contaLuz-contaInternet-contaCombustivel-
                contaCondominio-contaComida-contaOutros;
        
        JOptionPane.showMessageDialog(null, "O que sobrou do seu salário é: " + sobra);
       
       
       
    }
    
}
