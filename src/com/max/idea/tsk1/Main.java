package com.max.idea.tsk1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.print("Выберите проверяемую задачу: ");
    Scanner scanner = new Scanner(System.in);
    int task = scanner.nextInt();

    if (task == 1) {

      Task1 t1 = new Task1();
      System.out.print(Task1.task());
    } else if (task == 2) {

      Task2 t2 = new Task2();
      System.out.print(Task2.task2());
    } else if (task == 3) {

      Task3 t3 = new Task3();
      System.out.println(Task3.task3());
    }
    else if (task == 4) {
      Task4 t4 = new Task4();
      System.out.print(Task4.task4());
    }
    else if (task == 5) {
      Task5 t5 = new Task5();
      System.out.print(Task5.task5());
    } else {
      System.out.print("Выберите задачи от 1 до 5");
    }
  }
  }




