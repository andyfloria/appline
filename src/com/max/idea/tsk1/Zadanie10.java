package com.max.idea.tsk1;

import java.util.Scanner;
import java.util.Arrays;

public class Zadanie10 {
  public static void main(String[] args) {

    // Задаём размер матрицы (строки);
    System.out.println("Введите количество строк матрицы");
    Scanner scanner = new Scanner(System.in);
    int string = scanner.nextInt();

    //Задаём размер матрицы (столбцы)
    System.out.println("Введите количество столбцов матрицы");
    //Scanner scanner_column = new Scanner(System.in);
    int column = scanner.nextInt();

    int[][] dArrey = new int[string][column];

    //Задаём значения массиву
    for (int i = 0; i < string; i++) {
      for (int c = 0; c < column; c++) {
        System.out.println("Введите значения матрицы");
        dArrey[i][c] = scanner.nextInt();
        //System.out.print(" " + dArrey[i][c] + " ");
      }
    }
    //Вывод первой строки
    for (int i = 0; i < string; i++) {
      for (int c = 0; c < column; c++) {
      if (i == 0){
        System.out.print(" " + dArrey[i][c]*3 + " "); }
      }
      //System.out.println();
    }
  }
}

