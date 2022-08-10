/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.math.mathproj;

import java.util.Scanner;

/**
 *
 * @author suphi
 */
public class MyGrade {
    public static void main(String args[]){
      int s1,s2,s3,total;
      float avg;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of s1");
        s1=sc.nextInt();
        System.out.println("Enter value of s2");
        s2=sc.nextInt();
        System.out.println("Enter value of s3");
        s3=sc.nextInt();
        
        
     
      total=s1+s2+s3;
      avg=total/3.0f;
        System.out.println("total="+total);
        System.out.println("avg="+avg);
      
        
    } 
}
