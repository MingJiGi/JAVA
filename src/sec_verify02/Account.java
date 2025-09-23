package sec_verify02;

import java.util.Scanner;

public class Account {
    private String ano, owner;
    private int balance;
    public Account(String ano, String owner, int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }





}
