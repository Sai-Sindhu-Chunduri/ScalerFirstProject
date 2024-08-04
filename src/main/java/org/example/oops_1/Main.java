package org.example.oops_1;

public class Main {

    public static void main(String[] args) {
        Student one = new Student();
        one.name = "Sindhu";
        one.age = 23;
        one.psp = 95;
        one.changeBatch();
        one.joinClass();
        one.printDetails();

        Student two = new Student();
        two.name = "Sai";
        two.age = 24;
        two.psp = 90;
        two.printDetails();

    }
}