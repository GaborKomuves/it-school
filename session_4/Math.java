package session_4;

import java.util.Scanner;

public class Math {


    public static void main(String[] args) {
//      cel mai mare numar

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A");
        int A = sc.nextInt();
        System.out.println("Enter the number B");
        int B = sc.nextInt();
        System.out.println("Enter the number C");
        int C = sc.nextInt();
        sc.close();

        int bigNo = (A>B)? ((A>C)?A:C):((B>C)?B:C);
        System.out.println("Cel mai mare este " + bigNo);

//        if (A>B && A>C){
//            System.out.println("Cel mai mare nr este: 'A' = " + A);
//        } else if (B>A && B>C) {
//            System.out.println("Cel mai mare nr este: 'B' = " + B);
//        } else if (C>A && C>B) {
//            System.out.println("Cel mai mare nr este: 'C' =  " + C);
//        }else {
//            System.out.println("YOu did not enter a valid number!");
//        }




//        int contorPar = 0, contorImpar = 0;
//        for (int x = 1; x <= nr; x ++){
//            if (x % 2 == 0){
//                contorPar++;
//            }else   {
//                contorImpar++;
//            }
//        }
//        System.out.println("Numere pare: " + contorPar + " si numere impare sunt: " + contorImpar);
//        System.out.println(bigMr);
    }


}
