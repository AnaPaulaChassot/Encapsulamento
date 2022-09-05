/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suporte
 */
public class Agenda {
    
    private int dia;
    private int mes;
    private String anotacao;
    
    void anotar(int dia, int m, String nota){ // void não retorna.
        
        this.dia = dia; // this. refere atributo se tiverem nomes iguais
        mes=m; // Não igual, não precisa do this
        anotacao=nota;
        validaData();
        
    }
     private void validaData(){
        if ((dia<1) || (dia>31) || (mes>12)){
            dia=0;
            mes=0;
            anotacao="Data Inválida";
          
            
        }
    }
        
    public void mostrarAnotacao(){
        System.out.println(dia+" / "+mes+" : "+anotacao);
    }
    
    
}
