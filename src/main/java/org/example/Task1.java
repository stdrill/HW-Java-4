package org.example;
import java.util.Scanner;
import java.util.Stack;

//Вывести список на экран в перевернутом виде
public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0){
            list.add(n);
            n = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Список в перевернутом виде:");
        while (!list.empty()) {
            System.out.print(list.peek().toString() + " ");
            list.pop();
        }
        System.out.println();

    }
}