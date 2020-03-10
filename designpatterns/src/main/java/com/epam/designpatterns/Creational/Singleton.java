package com.epam.designpatterns.Creational;
 public class Singleton
 {
     private static Singleton instance;
       
     private Singleton()
     {
        
     }

     public static synchronized Singleton getInstance() {
         
         if(instance==null)
         instance =new Singleton();
         
         return instance;    
     }
     public String toString()
     {
         StringBuilder print = new StringBuilder();
         print.append("From Singleton Class \n");
         return print.toString();   
     }
 }