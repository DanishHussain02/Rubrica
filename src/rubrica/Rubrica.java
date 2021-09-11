/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Danish Hussain
 */
public class Rubrica {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) throws java.io.IOException {
        ArrayList<Contatto> r;
        r = new ArrayList<>();
        
        Contatto c0 = new Contatto("danish","hussain","Via volta 34", "3205639716");
        Contatto c1 = new Contatto("daniele","pivello","Via fura 35", "789485284");
        Contatto c2 = new Contatto("Luca","Paolo","Via fura 32", "78935572");
        r.add(c0);
        r.add(c1);
        r.add(c2);
        
        int opzioneSelezionata;
        Scanner s = new Scanner(System.in);
        System.out.print("Scegli opzione: ");
        opzioneSelezionata = s.nextInt();
        while(opzioneSelezionata != 0){
            if (opzioneSelezionata == 1){ // nuovo numero
                System.out.print("Aggiungi un nuovo contatto \nInserisci il nome: ");
                Scanner opzioneUno = new Scanner(System.in);
                String nome = opzioneUno.nextLine();
                System.out.print("Inserisci il cognome: ");
                String cognome = opzioneUno.nextLine();
                System.out.print("Inserisci il tuo indirizzo: ");
                String indirizzo = opzioneUno.nextLine();
                System.out.print("Inserisci il tuo numero: ");
                String numero = opzioneUno.nextLine();
         
                r.add(new Contatto(nome,cognome,indirizzo,numero));
            }
                
            if (opzioneSelezionata == 2){ //Cerca Numero
                System.out.print("CERCA IL NUMERO\nInserisci il nome: ");
                Scanner opzioneDue = new Scanner(System.in);
                String nome = opzioneDue.nextLine();
                System.out.print("Inserisci il cognome: ");
                String cognome = opzioneDue.nextLine();
                boolean trovato = false;
                for(int i = 0; i < r.size(); i++){
                    if(r.get(i).getNome().equalsIgnoreCase(nome) && r.get(i).getCognome().equalsIgnoreCase(cognome)){
                        System.out.println("Il numero di " + nome + " " + cognome + " è " + r.get(i).getNumero());
                        trovato = true;
                    }
                }
                if(trovato == false)
                    System.out.println("Nessun contatto trovato con quel nome!");
            }
            if(opzioneSelezionata == 3){ // stampa della rubrica
                System.out.println("------- Rubrica -------\n");
                for(int i = 0; i < r.size(); i++)
                    System.out.println(r.get(i));
            }
            
            System.out.print("\nScegli opzione: ");
            opzioneSelezionata = s.nextInt();
        }
        System.out.println("finito");
        
    }
}
