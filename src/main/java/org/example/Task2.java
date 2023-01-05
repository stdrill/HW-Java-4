package org.example;

import java.util.LinkedList;
import java.util.Scanner;

// Определить является ли список знакочередующимся
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            list.add(n);
            n = scanner.nextInt();
        }
        scanner.close();
        boolean flag = true;
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int previous = list.get(i - 1);

            if (((previous > 0) && ((current * (-1)) < 0)) || ((previous < 0) && ((current * (-1)) > 0))){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Список является знакочередующимся");
        }else {
            System.out.println("Список не является знакочередующимся");
        }

    }
}
