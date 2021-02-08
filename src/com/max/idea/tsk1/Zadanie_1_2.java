package com.max.idea.tsk1;

import java.util.Scanner;

public class Zadanie_1_2 {
  public static void main(String[] args) {
    System.out.println("Введите данные уравнения: \nнапример @$@=@,\nгде @ любая цифра от \"0\" до \"9\" или \"X\", \n$ знак \"+\" или \"-\".");
    int firstInt = 0;
    int secondInt = 0;
    int thirdInt = 0;
    int sum;
    int difference;
    //Просим ввести строку
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    final String plus = "+";
    final String minus = "-";

    String x = "x";
    Boolean a;
    Boolean b;
    Boolean c;
    Boolean d;
    Boolean e;
    Boolean g;

//Разбиваем строку на символы
    String[] q = s.split("");
    for (String ch : q) {
      a = q[1].equals(plus);
      b = q[1].equals(minus);
      c = q[4].equalsIgnoreCase(x);
      d = q[0].equalsIgnoreCase(x);
      e = q[2].equalsIgnoreCase(x);


      //firstInt = Integer.parseInt(q[0]);
      //secondInt = Integer.parseInt(q[2]);
      //thirdInt = Integer.parseInt(q[4]);


      if (a == true & c==true) {
        firstInt = Integer.parseInt(q[0]);
        secondInt = Integer.parseInt(q[2]);

        sum = firstInt + secondInt;
        System.out.println("Ответ: " + sum);
        break;
      } else if (b==true & c==true) {
        firstInt = Integer.parseInt(q[0]);
        secondInt = Integer.parseInt(q[2]);

        difference = firstInt - secondInt;
        System.out.println("Ответ: " + difference);
        break;
      } else if (d==true & a == true) {
        thirdInt = Integer.parseInt(q[4]);
        secondInt = Integer.parseInt(q[2]);

        sum = thirdInt - secondInt;
        System.out.println("Ответ: " + sum);
        break;
      } else if (d==true & b == true) {
        thirdInt = Integer.parseInt(q[4]);
        secondInt = Integer.parseInt(q[2]);

        difference = thirdInt + secondInt;
        System.out.println("Ответ: " + difference);
        break;
      } else if (e==true & a == true) {
        firstInt = Integer.parseInt(q[0]);
        thirdInt = Integer.parseInt(q[4]);

        sum = thirdInt - firstInt;
        System.out.println("Ответ: " + sum);
        break;
      } else if (e==true & b == true) {
        firstInt = Integer.parseInt(q[0]);
        thirdInt = Integer.parseInt(q[4]);

        difference = firstInt - thirdInt;
        System.out.println("Ответ: " + difference);
        break;
      }
    }
  }
}