package es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

    }
    public static List<Integer> generaN(int N){
        List<Integer> randomList = new ArrayList<>();
        Random rm = new Random();
        for (int i = 0; i<N; i++){
            randomList.add(rm.nextInt(101));
        }
        return randomList;
    }
}
