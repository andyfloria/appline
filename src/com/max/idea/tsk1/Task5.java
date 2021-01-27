package com.max.idea.tsk1;

import java.util.Scanner;

public class Task5 {
  public static int task5 () {
    System.out.println("Введите первое число: ");
    Scanner scanner = new Scanner(System.in);
    int a2 = scanner.nextInt();
    System.out.println("Введите второе число: ");
    int b2 = scanner.nextInt();

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
        System.out.println(a2 / b2);
        break;
      default: System.out.println("Вы ввели математическое действие неверно");
        return 0;
    }
    System.out.println("Успех");
    return 0;
  }
}
