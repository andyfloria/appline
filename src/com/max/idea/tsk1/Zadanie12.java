package com.max.idea.tsk1;

import java.util.Locale;

public class Zadanie12 {
  public static void main(String[] args) {
    String sub;
    String first = "I like Java!!!";
    boolean res = first.contains("Java");
    System.out.println(res);

    boolean res_stats = first.startsWith("I like");
    System.out.println(res_stats);

    boolean end = first.endsWith("!!!");
    System.out.println(end);

    if (res == true &&  res_stats == true && end == true) {
      System.out.println(first.toUpperCase());
    }
    sub = first.substring(7, 11);
    System.out.println(sub.replace('a', 'o'));
  }
}
