
package com;

public class JavaBasic {

    {
        System.out.println("Local Hello");
    }
    static{
        System.out.println("Static Hello");
    }
    public static void main(String[] args) {
        //variable
        int age = 10;
        System.out.println("Age: "+age);
        //Autobox
        Integer n = Integer.valueOf(age);
        System.out.println("Wrapper: "+n);
        
        //Unbox
        System.out.println("Unbox-------->"+n.intValue());
        
        Integer i = null;
        int x = 0;
        System.out.println("i------>"+i);
        System.out.println("i------>"+x);
        
    }
    
}
