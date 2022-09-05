/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suporte
 */
public class principal {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anotar(12,10, "Dia da Criança");
        agenda2.anotar(12,15, "Natal");
        
        agenda1.mostrarAnotacao();
        agenda2.mostrarAnotacao();
        
       // agenda2.dia=12; //Não aceita quando protege a outra classe com private
       // agenda2.mes=15;
      //  agenda2.anotacao="Natal";
        
        agenda2.mostrarAnotacao();
       
    }
    
    
}
