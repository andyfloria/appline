package com.max.idea.tsk1;
import java.util.Scanner;

public class Zadanie6 {
  public static void main(String[] args) {
    System.out.println("Выберите что переводить: 1 - масса; 2 - расстояние: ");
    Scanner scanner = new Scanner(System.in);
    int a3 = scanner.nextInt();

    switch (a3) {
      case 2:
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        int b3 = scanner.nextInt();

        System.out.println("Введите число: ");
        double c3 = scanner.nextInt();
        if (b3 == 1) {
          System.out.println("Метры:" + " " + c3);
          System.out.println("Мили:" + " " + c3*0.0006);
          System.out.println("Ярды:" + " " + c3*1.09);
          System.out.println("Футы:" + " " + c3*3.2);
        } else if (b3 == 2) {
          System.out.println("Метры:" + " " + c3 * 1609);
          System.out.println("Мили:" + " " + c3);
          System.out.println("Ярды:" + " " + c3 * 1760);
          System.out.println("Футы:" + " " + c3 * 5280);
        } else if (b3 == 3) {
          System.out.println("Метры:" + " " + c3 * 0.9);
          System.out.println("Мили:" + " " + c3*0.0005);
          System.out.println("Ярды:" + " " + c3);
          System.out.println("Футы:" + " " + c3 * 3);
        } else if (b3 == 4) {
          System.out.println("Метры:" + " " + c3 * 0.3);
          System.out.println("Мили:" + " " + c3 * 0.0001);
          System.out.println("Ярды:" + " " + c3 * 0.33);
          System.out.println("Футы:" + " " + c3);
        } else { System.out.println("Неверно выбрана единица измерения");
      }
        break;
      case 1:
        System.out.println("Выберите единицу измерения: 1 - килограммы, 2 - граммы, 3 - тонны, 4 - фунты: ");
        int d3 = scanner.nextInt();
        System.out.println("Введите число: ");
        double e3 = scanner.nextInt();
        if (d3 == 1) {
          System.out.println("Килограммы:" + " " + e3);
          System.out.println("Граммы:" + " " + e3*1000);
          System.out.println("Тонны:" + " " + e3/1000);
          System.out.println("Фунты:" + " " + e3*2.2);
        } else if (d3 == 2) {
          System.out.println("Килограммы:" + " " + e3/1000);
          System.out.println("Граммы:" + " " + e3);
          System.out.println("Тонны:" + " " + e3/1000000);
          System.out.println("Фунты:" + " " + e3*0.002);
        } else if (d3 == 3) {
          System.out.println("Килограммы:" + " " + e3*1000);
          System.out.println("Граммы:" + " " + e3*1000000);
          System.out.println("Тонны:" + " " + e3);
          System.out.println("Фунты:" + " " + e3*2204);
        } else if (d3 == 4) {
          System.out.println("Килограммы:" + " " + e3*0.45);
          System.out.println("Граммы:" + " " + e3*453.6);
          System.out.println("Тонны:" + " " + e3*0.0004);
          System.out.println("Фунты:" + " " + e3);
        } else { System.out.println("Неверно выбрана единица измерения");
        }
      break;
      default:
        System.out.println("Сделайте правильный выбор");
    }

  }
}
