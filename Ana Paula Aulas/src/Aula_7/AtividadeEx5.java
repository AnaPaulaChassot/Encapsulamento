/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_7;
import java.util.Scanner;
/**
 *
 * @author anapc
 */
public class AtividadeEx5 {
    public static void main (String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o sexo do aluno(a): (F para Feminino ou M para Masculino)");
        char sexo = leia.next().charAt(0);
        System.out.println("Digite a altura");
        double altura = leia.nextDouble();
        
       
      
        double pesoM;
        pesoM = (72.7*altura)-58;
        double pesoF;
        pesoF =(62.1*altura)-44.7;
        
        if (sexo=='M') {
            System.out.println("O peso ideal é: " + pesoM);
           
            
        }else {
            System.out.println("O peso ideal é: " + pesoF);
        }
        
        
    }
}
