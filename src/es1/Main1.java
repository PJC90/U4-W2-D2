package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {

        //SET controlla che le parole non devono essere duplicate
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero di parole che vuoi inserire:");
        int N = sc.nextInt();
        Set<String> paroleSet = new HashSet<>();
        Set<String> paroleDuplicateSet = new HashSet<>();
        for( int i = 0; i<N; i++){
            System.out.println("Inserisci la parola " + (i + 1)+ ":");
            String parola = sc.next();

            if(!paroleSet.add(parola)){
                paroleDuplicateSet.add(parola);
            }
        }

        System.out.println("hai inserito le seguenti parole:");
        for (String parola:paroleSet) {
            System.out.print(parola + " ");
        }
        System.out.println(" ");
        System.out.println("hai inserito le seguenti parole duplicate:");
        for (String parola:paroleDuplicateSet) {
            System.out.print(parola + " ");
        }
        sc.close();
    }
}