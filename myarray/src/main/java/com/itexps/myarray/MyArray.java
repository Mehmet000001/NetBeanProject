/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.myarray;

import java.util.Scanner;

/**
 *
 * @author suphi
 */
public class MyArray {
    public static void main(String args[]){
//        int x=0;
//        int a[]=new int[3];
//        a[0]=50;
//        a[2]=100;
//        x=5;
//        System.out.println("x="+a);
//          int data[] = {5,50,60,100,500};
//          String friends[]={"a","b","c","d"};
//          
//          for(int x=0;x<data.length;x++){//lenght if put extra number you can get.
//              System.out.println("data "+data[x]);
//             
//          }
//          for(int x=0;x<friends.length;x++){
//               System.out.println("friend "+friends[x]);
//          }
          int data[]=new int [3];
          Scanner sc=new Scanner(System.in);
          for(int x=0;x<data.length;x++){
              System.out.println("Enter number");
              data[x]=sc.nextInt();
          }
            System.out.println("enter value to be searched"); 
            int findvalue=sc.nextInt();
            int x=0;
             for( x=0;x<data.length;x++){
                 if(data[x]==findvalue){// if contion not match not show any value
                     System.out.println("found value in the list"+x);
                     break;
                             
                 }
             }
             if(x==3){
                 System.out.println("value not found");
             }
    }
    
}
