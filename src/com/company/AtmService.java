package com.company;

import java.util.Scanner;

public class AtmService {

    Card card;

    public Boolean addCard(Card card) {
        this.card = card;
        return true;
    }

    public void start(Card card, Integer pin) {
        if (card.checkPin(pin)) {

            this.addCard(card);
            System.out.println("Current balance : "+this.getBalance());


            System.out.println("1 - Положить деньги");
            System.out.println("2 - Взять деньги");
            System.out.println("3 - Выход");

            Integer work;
            Double sum;
            Scanner sc = new Scanner(System.in);
            work = sc.nextInt();

            while(work!=3)
            {

                if(work==1)
                {
                    sum=sc.nextDouble();
                    this.putCash(sum);

                }
                else if(work==2)
                {
                    sum=sc.nextDouble();
                    this.getCash(sum);

                }
                System.out.println("Current balance : "+this.getBalance());


                System.out.println("1 - Положить деньги");
                System.out.println("2 - Взять деньги");
                System.out.println("3 - Выход");

                work = sc.nextInt();
            }
        }
        else
        {
            System.out.println("Incorrect pin");
        }
    }

    public Double getCash(Double cash) {
        this.card.balance=this.card.getBalance() - cash;
        return this.card.balance;
    }

    public Double putCash(Double cash) {
        this.card.balance=this.card.getBalance() + cash;
        return this.card.balance;
    }

    public Double getBalance() {
        return this.card.getBalance();
    }

    public void stop() {

    }

}
