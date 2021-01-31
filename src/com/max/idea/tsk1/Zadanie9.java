package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
      //Переменная для суммирования
      double sum = 0;

      // Задаём размер массива;

      System.out.println("Введите размера массива: ");
      Scanner scanner = new Scanner(System.in);
      Scanner scannerDouble = new Scanner(System.in);
      int size_ar = scanner.nextInt();

      double cArrey [] = new double[size_ar];

      //Вводим значения массива;
      System.out.println("Введите значения массива: ");
      for (int i = 0; i < size_ar; i++) {
        cArrey[i] = scannerDouble.nextDouble();
        sum = sum + cArrey[i] / cArrey.length;
      }
      System.out.println("Средне арифметическое значение :" + " " + sum);

      // Умножаем на Средне арифметическое
      for (double values : cArrey) {
        System.out.println(values*sum);
      }
      }
    }


