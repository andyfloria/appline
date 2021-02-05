package com.max.idea.tsk1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// Итоговая задача №4

public class Zadanie_1_4 {
  public static void main(String[] args) {
    System.out.println("Отгадай загадку: \n \"Сидит дед,\n во сто шуб одет,\n кто его раздевает,\n тот слезы проливает\" \n\n Вам дано 3 попытки. \n\n Если нужна подсказка введите \"Подсказка\"");
// Вводим переменные для ответа и подсказки

    String ans = "Заархивированный вирус";
    String hint = "Подсказка";
    int[] counter = new int[]{1, 2, 3};
    int[] count_hint = new int[2];

    Boolean a;
    Boolean b;
    Boolean d;
//Внешний цикл
    first:
    for (int i = 0; i < counter.length; i++) {
      System.out.println("Введите ответ: ");
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
//Проверка на совпадение ответов переменным
      a = s.equalsIgnoreCase(ans);
      b = s.equalsIgnoreCase(hint);

      if (a == true & i >= 0) {
        System.out.println("Правильно!");
        break;
      } else if (a != true & b == true & i == 0) {
        System.out.println("Подсказка: То, чем можно заразится и он сидит в коробке");
//Внешний цикл
        second:
        for (int q=0; q<count_hint.length;q++) {
          System.out.println("Введите ответ: ");
          Scanner scanner_hint = new Scanner(System.in);
          String o = scanner_hint.nextLine();

          d = o.equalsIgnoreCase(ans);
          //b = s.equalsIgnoreCase(hint);

          if (d==true & q<1) {
            System.out.println("Правильно!");
            break first;
          } else if (d!=true & q==0) {
            System.out.println("Обидно, приходи в другой раз");
            break first;
          }
        } continue first;

      } else if (a != true & b == true & i == 1) {
        System.out.println("Подсказки уже недоступны");
        continue first;
      } else if (a != true & i <= 1) {
        System.out.println("Подумай ещё");
        continue first;
      } else if (a != true & i == 2) {
        System.out.println("Обидно, приходи в другой раз");
        break first;
      }
    }
  }
}