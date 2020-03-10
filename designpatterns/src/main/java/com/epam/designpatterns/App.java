package com.epam.designpatterns;

import com.epam.designpatterns.Behavioural.MediatorPattern;
import com.epam.designpatterns.Behavioural.TemplatePattern;
import com.epam.designpatterns.Creational.FactoryPattern;
import com.epam.designpatterns.Creational.Singleton;
import com.epam.designpatterns.Structural.FacadePattern;
import com.epam.designpatterns.Structural.ProxyPattern;


public class App 
{
    public static void main( String[] args )
    {
        //Singleton Design Pattern
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        //Factory Pattern Design Pattern
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.factory();

        //Proxy Pattern
        ProxyPattern proxy =new ProxyPattern();
        proxy.proxy();

        //Facade Pattern
        FacadePattern facadePattern = new FacadePattern();
        facadePattern.facade();

        //Template Pattern
        TemplatePattern template = new TemplatePattern();
        template.templatePattern();

        //Mediator Pattern
        MediatorPattern mediator = new MediatorPattern();
        mediator.mediatorPattern();
    }
}
