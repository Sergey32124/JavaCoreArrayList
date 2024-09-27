package org.example;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class User {


    private LocalDate data;
    private String login;
    private String possword;
    private int id;
    private Balance balance;

    public User(LocalDate data, String login, String possword, int id, Balance balance) {
        this.data = data;
        this.login = login;
        this.possword = possword;
        this.id = id;
        this.balance = balance;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
