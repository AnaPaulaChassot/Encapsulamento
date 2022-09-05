/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_7;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class AtividadeEx1 {
    
    public static void main (String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Usuário: ");
        String usuario = leia.nextLine();
        System.out.println("Senha: ");
        int senha = leia.nextInt();
        
        if (senha==1234) {
           System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
        }
        
    }
}
