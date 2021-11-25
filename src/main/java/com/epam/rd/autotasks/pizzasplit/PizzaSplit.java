package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int parts = scanner.nextInt();
        int i = 1;
        int find;
        while (true) {
            find = i * parts;
            if (find % people == 0) {
                break;
            }
            i++;
        }
        System.out.println(find / parts);

    }
}
