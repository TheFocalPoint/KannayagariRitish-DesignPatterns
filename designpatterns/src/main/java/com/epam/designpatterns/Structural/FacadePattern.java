package com.epam.designpatterns.Structural;
public class FacadePattern{
    public void facade() {
        System.out.println("Facade Pattern \n");
       ShapeMaker shapeMaker = new ShapeMaker();
 
       shapeMaker.drawCircle();
       shapeMaker.drawRectangle();
       shapeMaker.drawSquare();		
       System.out.println();
    }
 }