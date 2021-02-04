package com.max.idea.tsk1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Zadanie13 {
  public static void main(String[] args) {
    // Массив с латинскими буквами
    String[] ch = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    boolean s;
    // Переменная для счетчика
    int count_int = 0;

    System.out.println("Введите фразу латиницей и кирилицей");
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();

    //Создаём массив и делим его по пробелами определяя слова
    String eng[] = a.split(" ");//split("");
    int wordNumb = eng.length;
    //Заполяем массив словами
    for (String word : eng) {
      for (String word_ch : ch) {
        //Сравниваем слова с массивом латинских букв
          s = word.contains(word_ch);
          if (s == true) {
            count_int++;
            System.out.println(word);
            break;
          }
          }
        } System.out.println("Количество слов: " + count_int);
      }
    }

