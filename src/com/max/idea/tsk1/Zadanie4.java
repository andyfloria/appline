package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie4 {
  public static void main(String[] args) {
    //Задание №4

    System.out.println("Введите первое число: ");
    Scanner scanner = new Scanner(System.in);
    double a1 = scanner.nextDouble();
    System.out.println("Введите второе число: ");
    double b1 = scanner.nextDouble();
    System.out.println("Введите третье число: ");
    double c1 = scanner.nextDouble();

    double aver = (a1 + b1 + c1) / 3;
    System.out.println("Среднее арифметическое =" + " " + aver);

    double min_aver = aver / 2;
    double result = Math.round(min_aver);

    if (result > 3) {
      System.out.println("Программа выполнена корректно");
    }
  }
}
