package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie7 {
  public static void main(String[] args) {

    // Задаём константы
    final int x = 5;
    final int y = 7;
    final int z = 9;

    // Задаём размер массива;

    System.out.println("Введите размера массива: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();

    int[] aArrey = new int[size];

    //Вводим значения массива;
    System.out.println("Введите значения массива: ");
    for (int i = 0; i < size; i++) {
      aArrey[i] = scanner.nextInt();
      System.out.println(aArrey[i]);
    }
    for (int values : aArrey) {
      if (values == x | values == y | values == z) {
        System.out.println("Данное значение имеется в константах");
      }
    }
  }
}
