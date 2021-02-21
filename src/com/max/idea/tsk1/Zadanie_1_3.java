package com.max.idea.tsk1;

import java.util.*;

public class Zadanie_1_3 {
  public static void main(String[] args) {
// Просим ввести количество строк
    System.out.print("Количество строк: ");
    Scanner scanner = new Scanner(System.in);
    int string_value = scanner.nextInt();
// Переменная для корректного отображения № строк
    int a = 1 + string_value;
    // Переменная для счетчика
    int count = 0;

//Лист для записи слов
    ArrayList<String> out = new ArrayList<>();
    ArrayList<String> outFull = new ArrayList<>();
    ArrayList<Integer> countNumber = new ArrayList<>();
    Map<String, Integer> StMap = new HashMap<>();
//Цикл ввода слов
    for (int p = 1; p < a; p++) {

      System.out.print("Строка " + p + ": ");
      Scanner scanner_string = new Scanner(System.in);
      String strings = scanner_string.nextLine();
//Таблица ключ-значение - для подсчета количества символов в строке
      Map<Character, Integer> CharMap = new HashMap();


      char[] arr = strings.toLowerCase().toCharArray(); //переводим строку в символы
      for (char value : arr) {
        if (Character.isLetterOrDigit(value)) { //проверяем, что символы это буквы или цифры
          if (CharMap.containsKey(value)) { //проверяем на повторы
            CharMap.put(value, CharMap.get(value) + 1); //записываем в таблицу полученные результаты. если повтор прибавляем 1
          } else {
            CharMap.put(value, 1); //если повтора нет записываем 1
          }
        }
      }

      //System.out.println(CharMap);

      ArrayList<Integer> key = new ArrayList<>(CharMap.values());//записываем ключи
      //System.out.println(key);
      int e = Collections.frequency(key, 1); //ищем количество ключей = 1, т.е. без повторов в слове

      StMap.put(strings, e); //записываем в таблицу
      //System.out.println(StMap);
    }

      String maxK; //переменная для выводам слова с макс. кол-ом символов без повторов
      maxK = Collections.max(StMap.entrySet(), Map.Entry.comparingByValue()).getKey(); //ищем ключ с максимальным значением
      System.out.println(maxK);

    }
  }






