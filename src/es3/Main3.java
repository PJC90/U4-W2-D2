package es3;

import es3.entities.RubricaTelefonica;

public class Main3 {
    public static void main(String[] args) {
            RubricaTelefonica a = new RubricaTelefonica();
            a.inserisciContatto("Filippo", "333-6598476");
            a.inserisciContatto("Massimo","347-8849657");
            a.inserisciContatto("Giambruno","347-8849657");
            a.stampaRubrica();
            a.deleteByName("Filippo");
            a.stampaRubrica();
            a.findByName("Massimo");
            a.findByName("Massi");
            a.stampaRubrica();
            a.findByPhone("347-8849657");
    }

}
