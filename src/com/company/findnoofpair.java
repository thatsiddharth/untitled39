package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findnoofpair {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 8, 9, 7, 8};
        int sum = 16;
        getk(arr, sum);
    }
    public static void getk(int[] arr, int sum){
        int count=0;
        for(int i=0;i< arr.length;i++)
            for(int j=i+1;j< arr.length;j++)
                if((arr[i]+arr[j])==sum)
                    count++;
        System.out.printf("count of pairs %d",count);
    }
}
