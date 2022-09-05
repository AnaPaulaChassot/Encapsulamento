/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;

/**
 *
 * @author Suporte
 */
public class Atv {
    public static void main (String[] args) {
        
        int idade = 17;
        double altura = 1.75;
        
        if ((idade>=18)&&(altura>=1.75)){ //e
            System.out.println("Classificado");
        }else { if((idade>=18)||(altura>=1.75)){
            System.out.println("Foi quase! :/");
        }else
            System.out.println("Desclassificado");
        }
        }
    }

