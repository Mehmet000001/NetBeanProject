/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.myarraylist;

import java.util.StringTokenizer;

/**
 *
 * @author suphi
 */
public class HomeWork {
//  static int arr[]={1,2,3,4,5};
//    static int sum(){
//        int sum1=0;
//        for(int i=0;i<arr.length;i++)
//            sum1+=arr[i];
//        return sum1;
//    
//    }
//    public static void main(String args[]){
//        System.out.println("sum="+sum());
//    }
    public static void main(String args[]){
        String friends="Tushar,Patel,Bill,Smith,Ron,Willims";
        StringTokenizer st=new StringTokenizer(friends,",");
        while(st.hasMoreTokens()){
            String friend=st.nextToken();
            System.out.println(friend);
        }
    }
}
