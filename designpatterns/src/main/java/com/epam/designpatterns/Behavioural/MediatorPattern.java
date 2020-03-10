package com.epam.designpatterns.Behavioural;
public class MediatorPattern {
    public void mediatorPattern() {
        System.out.println("Mediator Pattern \n");
       User ritish = new User("Ritish");
       User harish = new User("Harish");
 
       ritish.sendMessage("Hi! Harish!");
       harish.sendMessage("Hello! Ritish!");

       System.out.println();
    }
 }