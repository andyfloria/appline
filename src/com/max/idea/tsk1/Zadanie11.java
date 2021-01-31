package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie11 {
  public static void main(String[] args) {
    System.out.println("Введите первое число");
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();

    //System.out.println(a);

    System.out.println("Введите первое число");
    Scanner scannerInt = new Scanner(System.in);
    Integer b = scannerInt.nextInt();

    //Перевод в Int

    Integer c = new Integer(a);

    //Сравнение
    boolean result;
    result = c.equals(b);
    System.out.println(result);

    //Вывод значений в консоль
    if (c > b) {
      System.out.println(c);
    } else if (c < b) {
      System.out.println(c.doubleValue());
    } else {
      System.out.println("Значения равны");
    }

    if (c < b) {
      System.out.println(b);
    } else if (c > b) {
      System.out.println(b.doubleValue());
    } else {
      System.out.println("Значения равны");
    }


  }
}
