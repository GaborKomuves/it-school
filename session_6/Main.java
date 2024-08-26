package session_6;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        stringPool();

        String str = "Hello World!";
        String str1 = "hello world!";
        System.out.println("Using equals " + str.equals(str1));
        System.out.println("using usingignoreUppercase = " + str.equalsIgnoreCase(str1));
        String email = "user@exemple.com";
        String domain = email.substring(email.indexOf("@"));
        System.out.println("domain is: " + domain);


        System.out.println("str length is " + str.length());//meoda lungime
        System.out.println("The character at index 1 is " + str.charAt(1));//metoda char
        System.out.println("The index of 'l' is " +str.indexOf("l"));//metoda index
        System.out.println("The substring from index 0n to 5is " + str.substring(0, 5));//metoda substring
        System.out.println("uppercase " + str.toUpperCase());
        System.out.println("lowercase " + str.toLowerCase());
    }

    private static void stringPool(){
        String str = "Hello World";
        String str1 = "Hello World";
        String str2 = new String("Hello World!");
        String str3 = new String("Hello World!");

        System.out.println("str == str1 = " + (str == str1));//true
        System.out.println("str.equals(str1) = " + (str.equals(str1)));//true
        System.out.println("str2 == str3 = " + (str2 == str3));//false
        System.out.println("str2.equals(str3) = " + (str2.equals(str3)));//true
    }

    public static void productCodeComparison(){
        String code ="PROD12345";
        String code1 = new String("PROD12345");

    }


}
