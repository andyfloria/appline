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
    int count = 1;

//Лист для записи слов
    ArrayList<String> out = new ArrayList<>();
    ArrayList<String> outFull = new ArrayList<>();
    ArrayList<Integer> countNumber = new ArrayList<>();

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
      ArrayList<Integer> key = new ArrayList<>(CharMap.values()); //записываем в список значения повторов букв
      //System.out.println("Ключи" + key);
      for (int number : key) {
        int pos = 1;
        Boolean u;
        if (number > 1) { //проверяем если букв больше чем 1 увеличиваем счетчик
          count++;
          //System.out.println("КЛЮЧ В ЦИКЛЕ" + number);
        } else if (number == 1) {
          count = 1;
        }
      } //System.out.println("Счетчик = " + count);

      if (count == 1) { //проверяем если букв не больше 1 записываем в список слово
        out.add(strings);
        //System.out.println("Массив аут: " + out);
      } else if (count > 1) {
        outFull.add(strings);
        //System.out.println("Массив аутФУЛ: " + outFull);
      }
    }
    //System.out.println(countNumber);
    if (out.size() > 0) { //выводим первое слово
      for (int z = 0; z == 0; z++) {
        System.out.println(out.get(z).toString());
      }
    } else  {
      for (int o = 0; o == 0; o++) {
        System.out.println(outFull.get(o).toString());
      }
    }
  }
}


