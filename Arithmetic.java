

package com.mycompany.arithmetic;


import java.util.Scanner;

public class Arithmetic {
    

    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        
        System.out.print("enter the first integer");
        int a=Input.nextInt();
        System.out.print("enter the second integer");
        
        int b=Input.nextInt();
        
     int  c=a-b;
     
        System.out.println("the answer is" +c);
    }
}
