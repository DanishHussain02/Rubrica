/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author Danish Hussain
 */
public class Contatto {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String numero;
    
    /**
     * Permette la creazione dell'oggetto contatto
     * @param nome
     * @param cognome
     * @param indirizzo
     * @param numero 
     */
    public Contatto(String nome, String cognome, String indirizzo, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numero = numero;
    }
    
    /**
     * Metodo che permette di copiare un contatto gia esistente in uno nuovo
     * @param c indica il contatto che si vuole copiare
     */
    public Contatto(Contatto c) {
        this.nome = c.nome;
        this.cognome = c.cognome;
        this.indirizzo = c.indirizzo;
        this.numero = c.numero;
    }

    /**
     * Metodo che permette di ottenere il numero del contatto
     * @return il numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Metodo che permette di ottenere il nome del contatto
     * @return il nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo che permette di ottenere il cognome del contatto
     * @return il cognome
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
    * Stampa informazioni del contatto
    * @return una stringa contenente le informazioni
    */
    @Override
    public String toString()
    {
        String s = "Nome: " + this.nome + " " + this.cognome + "\nIndirizzo: " + this.indirizzo + "\n" + "Numero: " + this.numero + "\n";
        return s;
    }
}
