package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println ("guess lamp" );
        for (int i = 1; i < 4; i++) {

            Scanner s1 =new Scanner (System.in);
            System.out.println ("try number" +""+ i );
            String in = s1.nextLine ();
            switch (in){
                case "lamp":
                    System.out.println ("match" );
                    System.out.println ("continue game? y/n" );
                    String con1 =s1.nextLine ();
                    if (con1.equals ("y")) {i= 0;}
                       else
                        System.out.println ("end game good job" );
                    i=4;
                    break;

                case "loose":
                    System.out.println ("ist lamp" );
                    i=4;
                    break;

                default:
                    System.out.println ("try left "+ (3-i));
                    if (i==3){

                        System.out.println ("continue game y/n" );
                   String con =s1.nextLine ();
                   if (con.equals ("n")) {
                       System.out.println ("game over" );
                       i=4;
                   }
                   else  i = 0;
                        System.out.println ("continue game11" );//h


                    }

 //                   System.out.println ("continue game y/n" );
//                    String con =s1.nextLine ();
//                    if (con.equals ("n"))
//                        i=4;




            }


        }
    }
}
