/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Atv4 {
    public static void main (String[] args){
        
       int vAdriana = 0;
        int vHelena = 0;
        int vAnaPaula = 0;
        int cont = 1;
        
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Número de eleitores votantes: ");
        int nEleitores = leia.nextInt();
        
        
        while (cont<=nEleitores){
        System.out.println("Digite o seu voto: ");
        int v = leia.nextInt();
        
       
        //validação de dados
        while((v!=365)&&(v!=462)&&(v!=591)){
            
            System.out.println("Número Inválido!");
            System.out.println("\nPara Adriana digitar: 365\nPara Helena digitar: 462\nPara Ana Paula digitar: 591");
             v = leia.nextInt();
            
        }
        cont=cont+1;
        
        
        if (v==365){
            
           vAdriana=vAdriana+1;
           System.out.println("Voto computado com sucesso!");
           
        }else if (v==462){
            
                
                vHelena = vHelena+1;
                System.out.println("Voto computado com sucesso!");
                
           
        }else if (v==591){
                
               vAnaPaula=vAnaPaula+1;
                System.out.println("Voto computado com sucesso!");
                }
       
                 
        }
        System.out.println("\nAdriana recebeu: "+vAdriana+" Votos"+
                       "\nHelena recebeu: "+vHelena+" Votos"+
                        "\nAna Paula recebeu: "+vAnaPaula+" Votos");
      
            }
                
      
        
        
        
    }


