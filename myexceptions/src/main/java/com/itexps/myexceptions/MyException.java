/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.myexceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author suphi
 */
public class MyException {
    public static void main(String args[]){
//        try{
//            System.out.println("1");
//            int a=0,b=5;
//            int c=b/a;//this give error you can not get sout.
//            System.out.println("c="+c);
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("Error :"+e.getMessage());
//        }catch(ArithmeticException e){
//            System.out.println("Error :"+e.getMessage());
//        }catch(Exception e) {//catch all
//            System.out.println("Error :"+e.getMessage());
//        }finally{
//            System.out.println("2");
//        }
          
        try{
            //Write File
             FileWriter fw = new FileWriter("c:\\data\\myfile.txt");
             //Create Buffer
             BufferedWriter bw = new BufferedWriter(fw);
             
             //Write content
             bw.write("This is first line \n");
             bw.write("This is second line ");
             //close file
             bw.close();
             fw.close();
        } catch(Exception e) {
            //Write error message
            System.out.println(e.getMessage());
    }
         
         //Read file
                try{
            //Create File
             FileReader fr = new FileReader("c:\\data\\myfile.txt");
             //Create Buffer
             BufferedReader br = new BufferedReader(fr);
             
             //Read content
             String line ="";
            while ( (line = br.readLine() ) != null) {
                    System.out.println(line);
                }
             //close file
             br.close();
             fr.close();
        } catch(Exception e) {
            //Write error message
            System.out.println(e.getMessage());
}
}
}
