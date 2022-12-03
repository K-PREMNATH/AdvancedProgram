package com;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class JavaVariable {

    public static void main(String[] args) {

        boolean bool = true;
        char ch = '&';

        byte b = 12;
        short s = 30;
        int i = 100;
        long l = 12999;

        float f = (float) 12.5;
        double d = 12.5;

        System.out.println("bool :" + bool);
        System.out.println("ch :" + ch);

        System.out.println("b :" + b);
        System.out.println("s :" + s);
        System.out.println("i :" + i);
        System.out.println("l :" + l);

        System.out.println("f :" + f);
        System.out.println("d :" + d);

        //
        String str = "Prem";
        System.out.println("Str-->" + str);

        //Array
        int ages[] = {12, 45, 67, 55};
        System.out.println("Array----->" + ages);
        System.out.println("Arrays.toString----->" + Arrays.toString(ages));

        //List
        //Set
        //Map
        //Enum
        System.out.println("Enum----------->" + UserEnum.adminUsers.getUserType());
        System.out.println("Enum----------->" + UserEnum.adminUsers.getId());
    }
}
