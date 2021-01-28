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

    int last2Num = nums[nums.length -1] = lastNumber;
    System.out.println("Первое число массива после изменения: " + " " + last2Num);
    int first2Num = nums[nums.length -5] = firstNumber;
    System.out.println("Второе число массива после изменения: " + " " + first2Num);


    int middleNumber = nums[nums.length -3];
    System.out.println(middleNumber);

    //вывод суммы первого и среднего элемента;
    int s = last2Num + middleNumber;
    System.out.println("Сумма первого и среднего элемента массива" + ": " + s);
}
}
