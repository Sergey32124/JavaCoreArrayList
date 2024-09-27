package org.example;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserServise {
    private ArrayList <User> users=new ArrayList<>(); ;
    Scanner scanner=new Scanner(System.in);
    public void addUser(){
        System.out.println("Введите id пользователя");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите логин пользователя");
        String log=scanner.nextLine();
        System.out.println("Введите пароль пользователя");
        String possword= scanner.nextLine();
        System.out.println("Введите день регистрации ");
        int day= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите месяц регистрации ");
        int math= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите год регистрации");
        int yar= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название валюты");
        String nameM=scanner.nextLine();
        System.out.println("Введите количество денег");
        Double sumM= scanner.nextDouble();;
        Balance balance=new Balance(nameM,sumM);

        if (day>0 && day<31 && math>0 && math<13 && yar>1990 && yar <2025) {
            LocalDate registrationDate = LocalDate.of(yar, math, day);

            User user = new User(registrationDate, log, possword, id, balance);
            users.add(user);
        }else {
            System.out.println("Error");
        }
        System.out.println("пользователь добавлен в лист");


    }
    public void delUser(){
        System.out.println("Введите какого пользователя надо удалить");
        String d=scanner.nextLine();
        for (User users1: users){
            if (users1.equals(d)){
                users.remove(d);
            }

        }
        System.out.println("Объект удален");

    }
    public void getUserId(){
        System.out.println("Введите id пользователя");
        int id=scanner.nextInt();
        for (User users1: users){
            if (users1.getId()==id){
                System.out.println(users1.getData()+" "+users1.getId()+
                        " "+users1.getLogin()+" "+users1.getPossword()+" "+
                        users1.getBalance().getName()+" "+users1.getBalance().getMoney());
            }

        }
    }

    public void clearUsers(ArrayList<User> users2) {

        users2.clear();
        System.out.println("Список полностью очищен");
    }
    public void print1000(){
        for (User users1: users){
            if (users1.getBalance().getMoney()>1000){
                System.out.println(users1.getData()+" "+users1.getId()+
                        " "+users1.getLogin()+" "+users1.getPossword()+" "+
                        users1.getBalance().getName()+" "+users1.getBalance().getMoney());
            }

        }
    }
}
