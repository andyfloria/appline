package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie5 {
  public static void main (String[] args) {
    System.out.println("Введите первое число: ");
    Scanner scanner = new Scanner(System.in);
    double a2 = scanner.nextDouble();
    System.out.println("Введите второе число: ");
    double b2 = scanner.nextDouble();

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Введите математическое действие +,-,*,/: ");
    String c2 = scanner1.next();

    switch (c2) {
      case "+":
        System.out.println(a2 + b2);
        break;
      case "-":
        System.out.println(a2 - b2);
        break;
      case "*":
        System.out.println(a2 * b2);
        break;
      case "/":
        if (b2 == 0 || b2 == 0.00 ) {
          System.out.println("Деление на 0 запрещено!");
        } else
        System.out.println(a2 / b2);
        break;
      default: System.out.println("Вы ввели математическое действие неверно");
    }
  }
}
