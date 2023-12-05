package es2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero di numeri da visualizzare:");
        int N = sc.nextInt();
        ArrayList<Integer> result = generaN(N);
        System.out.println("Ecco una lista ordinata di " + N + " numeri casuali da 0 a 100");
        System.out.println(result);
        ArrayList<Integer> listaInvertita = invertiLista(result);
        System.out.println("Nuova lista con la stessa invertita");
        System.out.println(listaInvertita);
        System.out.println("Scrivi true se vuoi stampare i valori in posizione pari altrimenti false:");
        boolean q = sc.nextBoolean();
        questionList(listaInvertita, q);
        sc.close();
    }
    public static ArrayList<Integer> generaN(int N){
        ArrayList<Integer> randomList = new ArrayList<>();
        Random rm = new Random();
        for (int i = 0; i<N; i++){
            randomList.add(rm.nextInt(101));
        }
        Collections.sort(randomList);
        return randomList;
    }
    public static ArrayList<Integer> invertiLista(ArrayList<Integer> list){
        ArrayList<Integer> listaInv = new ArrayList<>(list);
        Collections.reverse(listaInv);
        listaInv.addAll(list);
        return listaInv;
    }

    public static void questionList(ArrayList<Integer> list, boolean a){
        System.out.println("Valori in posizioni " + (a ? "pari":"dispari") + ":");
        for (int i = a ? 0 : 1; i<list.size(); i += 2 ){
            System.out.print(list.get(i) + ", ");
            //il metodo .get() è un metodo della classe ArrayList e List. restituisce l'elemento situato all'indice specificato all'interno della lista
            //gli indici iniziano da 0 quindi get(0) restituisce il primo elemento...
        }
        System.out.println();
    }
}
