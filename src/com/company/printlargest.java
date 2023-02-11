package com.company;

public class printlargest {
    static void print(int arr[],int arr_size){
int i,first,second,third;
if(arr_size<3)

    {
        System.out.println("invalid");
        return;
    }
    third=first=second=Integer.MIN_VALUE;
    for(i=0;i<arr_size;i++){
    if(arr[i]>first){
        third=second;
       second=first;
        first=arr[i];
    }
    else if(arr[i]>second ){
        third=second;
        second=arr[i];
    }

   }
    System.out.println( +second);
}

    public static void main(String[] args) {
int arr[]={12,5,6,7,8,9,2,4,5};
int n=arr.length;
print(arr,n);
}
}

