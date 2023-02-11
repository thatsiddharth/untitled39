package com.company;

import java.util.ArrayList;

public class zerotoend {
    public static void main(String[] args) {
        int[] arr={3, 5, 0, 0, 4};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(arr[i]);
            } else{
                list1.add(arr[i]);
            }
        }
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(list);
        System.out.println(list2);
    }
}
