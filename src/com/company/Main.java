package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println ("guess lamp" );
        for (int i = 0; i < 4; i++) {

            Scanner s1 =new Scanner (System.in);
            System.out.println ("try number" +""+ i );
            String in = s1.nextLine ();
            switch (in){
                case "lamp":
                    System.out.println ("match" );

                    i=4;
                    break;

                case "loose":
                    System.out.println ("ist lamp" );
                    i=4;
                    break;

                default:
                    System.out.println ("try left "+ (3-i));
                    System.out.println ("continue game y/n" );
                    String con =s1.nextLine ();
                    if (con.equals ("n"))
                        i=4;


            }


        }
    }
}
