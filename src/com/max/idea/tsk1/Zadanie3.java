package com.max.idea.tsk1;

public class Zadanie3 {
  public static void main(String[] args) {

//Задание №3
// задаём значение массива
    int[] nums = new int[]{2, 4, 6, 8, 10};

    int firstNumber = nums[nums.length -5];
    System.out.println("Первое число массива до изменения: " + " " + firstNumber);

    int lastNumber = nums[nums.length - 1];
    System.out.println("Последнее число массива до изменения: " + " " +lastNumber);
    //Смена местами первого и последнего значения массива

    firstNumber = nums[nums.length -5];
    System.out.println("Первое число массива после изменения: " + " " + firstNumber);
    lastNumber = nums[nums.length -1];



    int middleNumber = nums[nums.length -3];
    System.out.println(middleNumber);

    //вывод суммы первого и среднего элемента;
    int s = nums[0] + nums[2];
    System.out.println("Сумма первого и среднего элемента массива" + ": " + s);
}
}
