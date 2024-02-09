package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj=new RWOnly();
        /*
        obj.name = "HelloWorld";
        It is error because name is private member of RWOnly class.
         */
        obj.setName("Hello World");
        System.out.println(obj.getName());
    }
}