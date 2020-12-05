package com.company;

import java.util.Scanner;

public class Test {
    int n;
    ArrayList<Circle> circles = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Test(int n) {
        this.n = n;
    }
    void adding() {
        System.out.println("введи свойства объектов:");
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(scan.nextInt(), scan.next(), scan.nextBoolean()));
        }
    }
    void out() {
        System.out.println("твоя коллекция:");
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i).toString());
        }
    }

    void outSize() {
        System.out.println("размер : " + circles.size());
    }

    void addElement() {
        circles.add(new Circle(scan.nextInt(), scan.next(), scan.nextBoolean()));
    }

    void removeElement(int n) {
        try {
            circles.remove(n);
        }
        catch (Exception e) {
            System.out.println("низя удалить");
        }
    }
}