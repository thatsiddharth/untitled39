package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class monsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int count=0;
            for(int i=0;i<a;i++)
                if(sc.nextInt()==1)
                    count++;
            System.out.println(a- count / 2);

        }
    }
}
