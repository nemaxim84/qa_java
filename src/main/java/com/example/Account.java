package com.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean checkNameToEmboss;
        if (name.contains(" ") && name.length() >= 3 && name.length() <= 19 && !name.endsWith(" ") && !name.startsWith(" ") && name.split(" ").length == 2) {
            return true;
        } else return false;
    }
}
