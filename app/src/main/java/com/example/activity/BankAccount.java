package com.example.activity;

public class BankAccount {

    int id;
    String name ;
    double balance;

    double popolnenieSchena(double popolnenie){
        balance += popolnenie;
        return (balance);
    }

    double snyatieSoScheta(double snyatie){
        balance -= snyatie;
        return (balance);
    }
}
class  BankAccountTest {

    public static void main(String[] args){
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.name = "Zik";
        MyAccount.id = 1;
        MyAccount.balance = 130;

        YourAccount.name = "Katya";
        YourAccount.id = 2;
        YourAccount.balance = 1500;

        HisAccount.name = "Tolya";
        HisAccount.id = 3;
        HisAccount.balance =10;

        MyAccount.balance = MyAccount.popolnenieSchena(20);
        System.out.println(MyAccount.balance);
        System.out.println(MyAccount.snyatieSoScheta(50));
    }
}