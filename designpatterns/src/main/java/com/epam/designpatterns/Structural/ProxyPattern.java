package com.epam.designpatterns.Structural;
public class ProxyPattern {
	
    public void proxy() {
       System.out.println("Proxy Pattern \n");
       Image image = new ProxyImage("ritish.jpg");
 
       //image will be loaded from disk
       image.display(); 
       System.out.println("");
       
       //image will not be loaded from disk
       image.display(); 	

       System.out.println();
    }
 }