package com.company;

import java.awt.event.TextListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("arrayList:");
        int n1 = scan.nextInt();
        if (n1 != 0) {
            TestArray test1 = new TestArray(n1);
            test1.adding();
            test1.out();
            test1.outSize();
            test1.arrayRemove(0);
            test1.out();
            test1.arrayClear();
        }

        System.out.println("linkedList:");
        int n2 = scan.nextInt();
        if (n2 != 0) {
            TestLinked test2 = new TestLinked(n2);
            test2.additing();
            System.out.println("добавляемый элемент:");
            test2.addElement(scan.nextInt());
            test2.firstLast();
            test2.out();
            test2.outDelFL();
            test2.out();
        }

        System.out.println("размер:");
        int n3 = scan.nextInt();
        if (n3 != 0) {
            Test test3 = new Test(n3);
            test3.adding();
            System.out.println("элемент,который необходимо добавить:");
            test3.addElement();
            test3.removeElement(0);
            test3.outSize();
            test3.out();
        }

    }
}