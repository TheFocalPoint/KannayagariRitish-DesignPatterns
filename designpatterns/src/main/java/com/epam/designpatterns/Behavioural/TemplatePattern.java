package com.epam.designpatterns.Behavioural;
public class TemplatePattern {
    public void templatePattern() {
        System.out.println("Template Pattern \n");
       Game game = new Cricket();
       game.play();
       System.out.println();
       game = new Football();
       game.play();		

       System.out.println();
    }
 }