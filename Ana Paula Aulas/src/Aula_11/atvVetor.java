/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11;
import java.util.Scanner;
/**
 *
 * @author anapc
 */
public class atvVetor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int v[] = new int[4];
        
        for(int a=0;a<v.length;a++){
            
            System.out.println("Digite o valor " +(a+1));
            v[a]=leia.nextInt();
            
        }
        for(int a=0;a<v.length;a++){
            
            for(int b=0;b<v.length;b++){
                
                if(v[a]>v[b]){

                    int x = v[a];
                    v[a]=v[b];
                    v[b]=x;
                }
                  }  
                }
               System.out.print("Os números digitados, em ordem decrescente são: ");
               
                for(int a=0;a<v.length;a++){
                    
                    System.out.print(+v[a]+", ");
                   
               }
            }
            
            
            
        }
        
    
    

