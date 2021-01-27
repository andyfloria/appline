package com.max.idea.tsk1;

import java.util.Scanner;

public class Task4 {
  public static int task4 () {
    //Задание №4

    System.out.println("Введите первое число: ");
    Scanner scanner = new Scanner(System.in);
    int a1 = scanner.nextInt();
    System.out.println("Введите второе число: ");
    int b1 = scanner.nextInt();
    System.out.println("Введите третье число: ");
    int c1 = scanner.nextInt();

    int aver = (a1 + b1 + c1) / 3;
    System.out.println("Среднее арифметическое =" + " " + aver);

    int min_aver = aver / 2;
    int result = Math.round(min_aver);

    if (result > 0 && result > 3) {
      System.out.println("Программа выполнена корректно");
    }
    return  0;
  }
}
