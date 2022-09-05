/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Ativ01 {
    public static void main(String[] args) {
        
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o código da cor conforme a tabela: "
                + "\n Azor4 = Rosa"
                + "\n PTR## = Azul"
        + "\n ASPO0 = Violeta"
        + "\n 23 = Preto"
        + "\n 5 a 9 = Tom de azul"
        + "\n Ar43 = Vermelho"
        + "\n De A a F = Cinza"
        + "\n HP659T = Amarelo");
        
        String c = leia.nextLine(); 
       
       
             
             
        switch (c){
            case "Azor4": {
                System.out.println("Rosa");
                break;
            }
             case "PTR##": {
                System.out.println("Azul");
                break;
            }
              case "ASPO0": {
                System.out.println("Violeta");
                break;
            }
               case "23": {
                System.out.println("Preto");
                break;
            }
                case "5":
                case "6":
                case "7":
                case "8":
                case "9": {
                System.out.println("Tom de Azul");
                break;
            }
                 case "Ar43": {
                System.out.println("Vermelho");
                break;
            }
                  case "A":
                  case "B":
                  case "C":
                  case "D":
                  case "E":
                  case "F": {
                System.out.println("Cinza");
                break;
            }
                   case "HP659T": {
                System.out.println("Amarelo");
                break;
            }default: {
                System.out.println("Código Inválido");
            }
                
            
        }
    
    
    }
}
