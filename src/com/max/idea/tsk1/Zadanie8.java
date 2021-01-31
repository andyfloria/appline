package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie8 {
  public static void main(String[] args) {

    int sum = 0;

    System.out.println("Введите любое положительное число");
    Scanner scanner = new Scanner(System.in);
    int values = scanner.nextInt();

    int[] bArrey = new int[values];

    if (values < 0) {
      System.out.println("Введите любое положительное число");
    }
    for (int i = 1; i < values; i++) {
      if (i % 2 != 0) {
        bArrey[i] = i;
        sum = sum + bArrey[i];
      }
      //System.out.println(bArrey[i]);
      }
    System.out.println("Сумма нечетных чисел = " + sum);
    }

}
