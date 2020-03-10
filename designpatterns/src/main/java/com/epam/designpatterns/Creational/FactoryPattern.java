package com.epam.designpatterns.Creational;
public class FactoryPattern {

    public void factory () {
       System.out.println("Factory Pattern \n");
       ShapeFactory shapeFactory = new ShapeFactory();
 
       Shape shape1 = shapeFactory.getShape("CIRCLE");
 
       shape1.draw();
 
       Shape shape2 = shapeFactory.getShape("RECTANGLE");
 
       shape2.draw();
 
       Shape shape3 = shapeFactory.getShape("SQUARE");
 
       shape3.draw();

       System.out.println();
    }
 }