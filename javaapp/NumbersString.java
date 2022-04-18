package com.vikasdew.javaapp;

import java.util.Scanner;

public class NumbersString {
 /*   public static String extractInt(String str)
    {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");

        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String numberOnly = str.replaceAll("[^0-9]", "");


        System.out.println(numberOnly);


          /*String intger = extractInt(str);
        System.out.println(intger);*/
        // string contains numbers

        // extract digits only from strings
        // print the digits
    }

}
