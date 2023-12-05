package es3.entities;

import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }
    public void inserisciContatto(String nome, String numeroTelefono){
        rubrica.put(nome, numeroTelefono);
        System.out.println("Contatto inserito " + nome +", " + numeroTelefono);
    }
}
