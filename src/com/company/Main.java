package com.company;

import java.util.Random;
import java.util.Scanner;

import com.company.Atm;
import com.company.AtmService;
import com.company.Card;
import com.company.Client;



public class Main {

    static Card cardlist[];

    public static void main(String[] args) {

        cardlist = new Card[3];

        cardlist[0] = new Card();
        cardlist[0].number = "7899-4564";
        cardlist[0].pin = 1021;
        cardlist[0].balance = 65478.0;

        cardlist[1] = new Card();
        cardlist[1].number = "7888-4565";
        cardlist[1].pin = 6545;
        cardlist[1].balance = 321.0;

        cardlist[2] = new Card();
        cardlist[2].number = "7812-4567";
        cardlist[2].pin = 7845;
        cardlist[2].balance = 9854.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number ");

        String numcard = sc.nextLine();

        while (numcard.trim().length() == 0) {
            numcard = sc.nextLine();
        }

        numcard=numcard.trim();
        System.out.print("Enter your pin ");

        Integer pin = sc.nextInt();
        for (int i = 0; i < cardlist.length; i++)
        {

            if (numcard.equals(cardlist[i].number))
            {

                AtmService atmservice=new AtmService();
                atmservice.start(cardlist[i], pin);

                break;
            }
        }

    }
}


