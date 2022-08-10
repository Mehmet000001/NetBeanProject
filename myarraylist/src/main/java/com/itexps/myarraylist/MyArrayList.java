/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.myarraylist;

import java.util.ArrayList;

/**
 *
 * @author suphi
 */
public class MyArrayList {
    public static void main(String args[]){
        ArrayList<String> friendList= new ArrayList<String>();
        friendList.add("mike");
         friendList.add("amy");
          friendList.add("kevin");
          friendList.add(1,"john");
          friendList.remove(3);
          System.out.println("friend "+friendList);
          for(String friend:friendList){
              System.out.println(friend);
          }
              
    }
}
