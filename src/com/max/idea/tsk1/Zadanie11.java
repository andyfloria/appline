package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie11 {
  public static void main(String[] args) {

    String x;

    System.out.println("Введите первое число");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();

    System.out.println("Введите второе число");
    Scanner scannerInt = new Scanner(System.in);
    double b = scannerInt.nextDouble();

    //System.out.println(a);
    //System.out.println(b);

    //Сохраняем в строку
    x = Double.toString(a);
    System.out.println("Строка: " + x);

    //Сохраняем в int второе
    int z = (int) b;
    System.out.println("Целое число: " + z);


    //Вывод значений в консоль
    if (a > b) {
      System.out.println("Большее значение:" + a);
    } else if (a < b) {
      System.out.println("Меньшее значение: " + a);
    } else {
      System.out.println("Значения равны");
    }

    if (a < b) {
      System.out.println("Большее значение:" + b);
    } else if (a > b) {
      System.out.println("Меньшее значение: "+ b);
    } else {
      System.out.println("Значения равны");
    }
  }
}
