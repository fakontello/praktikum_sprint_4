package ru.yandex.fourth;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        String cardHolderName = "Евгений Симхаев";
        Account account = new Account(cardHolderName);
        boolean validName = account.checkNameToEmboss();
        if (validName) {
            System.out.println("Имя пригодно для печати на карте");
        } else {
            System.out.println("Данное имя не подходит для печати на карте");
        }
    }
}
