package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("podaj liczbę 1 ");
        Scanner scanner = new Scanner(System.in);
        String lp = scanner.nextLine();
        int lp1 = Integer.valueOf(lp);

        System.out.println("podaj liczbę 2 ");
        String ld = scanner.nextLine();
        int lp2 = Integer.valueOf(ld);

        System.out.println("wybierz dzlałanie");
        String lt = scanner.nextLine();

        if (lt.equals("+")) {
            int w1 = lp1 + lp2;
            System.out.println("Wynik: " + w1);
            scanner.nextLine();


        } else if (lt.equals("-")) {
            int w1 = lp1 - lp2;
            System.out.println("Wynik: " + w1);
            scanner.nextLine();

        } else if (lt.equals("*")) {
            int w1 = lp1 * lp2;
            System.out.println("Wynik: " + w1);
            scanner.nextLine();
        } else if (lt.equals("/")) {

            if (lp2 == 0) {
                System.out.println("Nie można dzielić przez 0");
            } else {

                double w1 = (double)
                        lp1 / lp2;
                System.out.println("Wynik: " + w1);
                scanner.nextLine();
            }
        } else
            System.out.println("błąd!!!");


    }
}



