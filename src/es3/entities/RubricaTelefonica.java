package es3.entities;

import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica = new HashMap<>();


    public void inserisciContatto(String nome, String numeroTelefono){
        rubrica.put(nome, numeroTelefono);
        System.out.println("Contatto inserito " + nome +", " + numeroTelefono);
    }

    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (String name : rubrica.keySet()) {
            String numTel = rubrica.get(name);
            System.out.println(name + ":" + numTel);
        }
    }
        public void deleteByName(String nome) {
            if(rubrica.containsKey(nome)){
                rubrica.remove(nome);
                System.out.println("****Contatto cancellato*****");
            }else{
                System.out.println("contatto non trovato");
            }

        }
//    Il metodo keySet() è un metodo della classe HashMap in Java e restituisce un Set contenente tutte le chiavi presenti nella mappa.
//    Nel contesto di una rubrica telefonica come nel tuo esempio, le chiavi rappresentano i nomi delle persone.
        public void findByName(String nome){
        String phone = rubrica.get(nome);
            //get(0) restituisce il primo elemento...  restituisce l'elemento situato all'indice specificato all'interno della lista
            System.out.println(phone != null ? (nome + " " + phone +" Find by name!!!") : (nome + " non è stato trovato :("));
        }

        public void findByPhone(String phone){
        String result = "";
        for (String nome : rubrica.keySet()){
            if(phone.equals(rubrica.get(nome))){
                result = nome;
            }
            System.out.println(!result.isEmpty() ? (result + "  Cercato in base al numero fornito!") : "Peccato contatto non trovato");
        }
        }
}
/*             *    ForEach    *
    for (tipo elemento : collezione) {
        // Operazioni da eseguire su ogni elemento
        }
          tipo --------> è il tipo
          elemento --------> è una variabile che rappresenta l'elemento corrente durante l'iterazione.
          collezione --------> è la collezione di elementi su cui si itera.

Esempio:   List<String> nomi = new ArrayList<>();
                nomi.add("Alice");
                nomi.add("Bob");
                nomi.add("Charlie");

                for (String nome : nomi) {
                    System.out.println(nome);
                }

        */
