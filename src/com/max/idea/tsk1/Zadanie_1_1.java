package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie_1_1 {
  public static void main(String[] args) {
// Создаём пустой массив длиной 50 (цифра взята такая, чтобы пользователь понял, что от него требуется наверняка:)
    int[] calc = new int[50];
    first:
    for (int i = 0; i < calc.length; i++) {
// Просим ввести курс доллара
      System.out.println("Введите текущий курс доллара в рублях: ");
      Scanner scanner = new Scanner(System.in);
      double course = scanner.nextDouble();
// Проверка на 0 или отрицательное число
      if (course <= 0) {
        System.out.println("Курс доллара не может быть 0 или меньше 0");
        continue first;
      } else if (course > 0) {

        second:
        for (int q = 0; q < calc.length; q++) {

          System.out.println("Введите число в рублях: ");
          Scanner scannerValue = new Scanner(System.in);
          double value = scannerValue.nextDouble();
          // Проверка на 0 или отрицательное число
          if (value <= 0) {
            System.out.println("Количество не может быть 0 или меньше 0");
            continue;
          } else if (value > 0) {
            Double d;
            String result;
            String resultCourse;
            long resultValue;
//Считаем доллары
            d = value / course;
            resultCourse = String.format("%.2f", course);
            System.out.println("Курс доллара: " + resultCourse);
            resultValue = Math.round(value);
            System.out.println("Количество рублей: " + resultValue);
            result = String.format("%.2f", d);
            System.out.printf("Итого долларов: " + result);
            break first;
          }

        }
      }
    }
  }
}
//Не стал предусматривать, что будет если цикл кончится.