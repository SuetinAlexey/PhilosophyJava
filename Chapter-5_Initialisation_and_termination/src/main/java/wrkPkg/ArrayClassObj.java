package wrkPkg;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        //Integer[] a = new Integer[rand.nextInt(20)];
        Integer[] a = new Integer[20]; // создаем массив длиной 20 элемнтов
        System.out.println("Длина а = "+ a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // заполняем случайными числами
        System.out.println(Arrays.toString(a));
    }
}
