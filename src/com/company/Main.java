package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int n = random.nextInt(100);
            arrayList.add(n);
            if (n%2==0){
                even.add(n);
            }else{
                odd.add(n);
            }

        }
        System.out.println("Random numbers[1-100]: "+arrayList);
        System.out.println("Random even numbers[1-100]: "+even);
        System.out.println("Random odd numbers[1-100]: "+odd);
    }
}
