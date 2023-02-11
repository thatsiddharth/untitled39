package com.company;
import java.io.*;
public class zeoava {
    static void sort(int a[],int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
    static void printArray(int arr[],int arr_size) {
        for (int i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 0, 0};
        int arr_size = arr.length;
        sort(arr, arr_size);
        printArray(arr, arr_size);
    }

    }

