import java.util.Random;
import java.util.ArrayList;

//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
public class Task_01 {
    public static void main(String[] args){
        Random random = new Random();
        int num = random.nextInt(2001);
        System.out.println("Случайное целое число в диапазоне от 0 до 2000: " +num);
        
        int n = 0;
        int x = num;
        while (x != 0) {
            n ++;
            x = x >>> 1;
        }
        System.out.println("Номер старшего значащего бита: " + n);

        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for (int j = 1; j <= Short.MAX_VALUE; j++) {
            int result = num % j;
            if (result == 0){
                m1.add(j);
            }
        }
        System.out.println("Массив кратных чисел n: " + m1);

        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int k = 1; k <= num; k++) {
            int result = num % k;
            if (result != 0){
                m2.add(k);
            }
        }
        System.out.println("Массив некратных чисел n: " + m2);
    }
}

