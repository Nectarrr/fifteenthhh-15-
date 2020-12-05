package com.company;


import java.util.LinkedList;
import java.util.Scanner;

public class TestLinked {
    LinkedList<String> msg = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    int n;

    public TestLinked(int n) {
        this.n = n;
    }

    void additing() {
        System.out.println("введи сообщения для Linked");
        for (int i = 0; i < n; i++) {
            msg.add(scan.nextLine());
        }
    }

    void addElement(int i) {
        if (i < msg.size()) {
            msg.add(i, scan.nextLine());
        }
        else {
            System.out.println("некорректно");
        }
    }

    void firstLast() {
        System.out.println("введи 1-й добавляемый элемент:");
        msg.addFirst(scan.nextLine());
        System.out.println("введи последний добавляемый элемент:");
        msg.addLast(scan.nextLine());
        System.out.println("1-й и последний элементы Linked:");
        System.out.println(msg.peekFirst());
        System.out.println(msg.peekLast());

    }

    void outDelFL() {
        System.out.println("Выводим и удаляем 1-й и последний элементы:");
        System.out.println(msg.pollFirst());
        System.out.println(msg.pollLast());
    }

    void out() {
        System.out.println("LinkedList:");
        System.out.println(msg);
    }
}