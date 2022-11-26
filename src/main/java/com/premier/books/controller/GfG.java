package com.premier.books.controller;

import java.lang.*;
import java.util.Scanner;

public class GfG {

    public static void main(String argc[]) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count= count(n);
        System.out.println(count);

    }
    static int count(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count=count+2;
                }

            }
        }
        return count;
    }
}

