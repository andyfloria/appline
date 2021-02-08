package com.max.idea.tsk1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Zadanie13 {
  public static void main(String[] args) {
    // Переменные для проверки рег. выражений
    boolean s;
    boolean d;
    // Переменная для счетчика
    int count_int = 0;

    System.out.println("Введите фразу латиницей и кирилицей");
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();

    //Создаём массив и делим его по пробелами определяя слова
    String eng[] = a.split("\\s");

    //Заполяем массив словами
    for (String word : eng) {

      d = word.matches("^[a-zA-Z]*");
      s = word.matches("^[а-я]*");
      //if (s != true & d==true) {
        if (d==true && !s) {
        System.out.println(word);
        count_int++;
      }
    } System.out.println("Количество слов: " + count_int);
  }
}


