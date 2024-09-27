package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        UserServise userServise=new UserServise();
        ArrayList<User> users=new ArrayList<>();
        while (flag){

            System.out.println("1 Создать пользователя");
            System.out.println("2 Удалить пользователя из списка");
            System.out.println("3 Ввывод всех пользователей баланс которых больше 1000");
            System.out.println("4 Вернуть пользователя по id");
            System.out.println("5 Вернуть список всех пользователей и удалить");
            System.out.println("6 выход");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Выберите пункт меню");
            String str=scanner.nextLine();
            if(str.equals("1")){
               userServise.addUser();


            } else if (str.equals("2")) {
                userServise.delUser();

            } else if (str.equals("3")) {
                userServise.print1000();

            } else if (str.equals("4")) {
                userServise.getUserId();

            } else if (str.equals("5")) {
                    userServise.clearUsers(users);
            } else if (str.equals("6")) {
                    flag=false;
                System.out.println("Программа закрыта");
            }else {
                System.out.println("Вы ошиблись");
            }

        }
    }

}
