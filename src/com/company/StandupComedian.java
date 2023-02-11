package com.company;

import java.util.Scanner;

public class StandupComedian {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {


            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            if (a == 0) {
                System.out.println(1);
                continue;
            }
            int ans = a + 2 * Math.min(b, c) + Math.min(a + 1, Math.abs(b - c) + d);
            System.out.println(ans);
        }

    }
}
