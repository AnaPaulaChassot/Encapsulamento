/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11;

/**
 *
 * @author Suporte
 */
public class classVetor {
    public static void main(String[] args) {
        
        int n [] = new int [3]; //Forma 1
        
        n[0]=15;
        n[1]=30;
        n[2]=45;
        
       //  System.out.println(n[0]); // ler vetor
        
      //  int n[] = {15,30,45}; // Forma 2
        String nome[] = {"nome1","nome2","nome3"};
        
        for(int i=0;i<3;i++){ //
            System.out.println(nome[i]);
        }
        
        for(int i=0;i<nome.length;i++){ // .length usa direto o tamanho do vetor
            System.out.println(nome[i]);
        }
            
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
            
        }

    }
    
}
