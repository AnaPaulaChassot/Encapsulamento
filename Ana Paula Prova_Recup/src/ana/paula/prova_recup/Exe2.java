package ana.paula.prova_recup;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Exe2 {

    public static void main(String[] args) {

        int s = 0;
        int m = 0;
        

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores desejada: ");
        int qt = leia.nextInt();
        
        
        int v[] = new int[qt];

        for (int c = 0; c < qt; c++) {

            System.out.println("Digite o " + c + "° número: ");
            v[c] = leia.nextInt(); 
           
            
        }

        System.out.println("Os valores digitados foram: ");

        
         for (int c = 0; c < qt; c++) { 
            s = s + v[c];
            m = s / qt;
            System.out.print(v[c] + " ,");
        }

        
        System.out.println("A soma dos valores é: " + s);
        System.out.println("A média dos valores é: " + m);

        System.out.println("A multiplicação de cada valor por dois é: ");

         for (int c = 0; c <qt; c++) {
            System.out.print(v[c]*2 + " ,");
        }

    }

}

