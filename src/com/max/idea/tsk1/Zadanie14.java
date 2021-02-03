package com.max.idea.tsk1;

import java.util.Arrays;
import java.util.Random;

public class Zadanie14 {
  public static void main(String[] args) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int min_mod = 0;
    int max_mod = 0;

    //Формируем массив
    int num[] = new int[15];
    for (int a:num) {
        a = (int) (Math.random() * (40 + 1)) - 20;
          for (int i = 0; i < num.length; i++) {
          num[i] = a;
          if (a < min) {
            min = num[i];
          }
          if (a > max) {
            max = num[i];
          }
        } System.out.println(a + ",");
     }
    // Ищем модуль минимального значения
    min_mod = Math.abs(min);

    // Ищем модуль минимального значения
    max_mod = Math.abs(max);
    // Сравнимаем модули
    if (max_mod > min_mod) {
      System.out.println("Максимальное значение по модулю: " + max_mod);
    } else {
      System.out.println("Максимальное значение по модулю: " + min_mod);
    }
    System.out.println("Минимальное значение: " + min);
    System.out.println("Максимальное значение: " + max);

    System.out.println();
  }
}

