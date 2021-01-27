package com.max.idea.tsk1;

public class Task3 {
  public static int task3 () {

//Задание №3
// задаём значение массива
    int[] nums = new int[]{2, 4, 6, 8, 10};
    System.out.println(nums[0]);
    System.out.println(nums[4]);
    // меняем местами первый и последний элемент
    nums[0] = 10;
    nums[4] = 2;
    System.out.println(nums[0]);
    System.out.println(nums[4]);
    //вывод суммы первого и среднего элемента;
    int s = nums[0] + nums[2];
    System.out.println("Сумма первого и среднего элемента массива" + ": " + s);
    return 0;
}
}
