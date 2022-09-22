/*1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
Пункты реализовать в методе main*/

package HW1;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        
        int i = (int)(Math.random()*(100-(-100)))+(-100);
        System.out.println("вот рандомное число i: " + i);

        String temp = Integer.toBinaryString(i);
        System.out.println("вот оно же в двоичной системе: " + temp);
        int n = temp.length();
        System.out.println("старший значащий бит n стоит на позиции " + n);
        
        ArrayList<Integer>arrayListDivisible = new ArrayList<>();
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                arrayListDivisible.add(j);
                }
        }
        int[] m1 = new int[arrayListDivisible.size()];
        for (int j = 0; j < arrayListDivisible.size(); j++) {
            m1[j] = arrayListDivisible.get(j);
        }
        System.out.println("вот массив m1: " + Arrays.toString(m1));
       
        

        ArrayList<Integer>arrayListNonDivisible = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                arrayListNonDivisible.add(j);
                }
        }
        
        int[] m2 = new int[arrayListNonDivisible.size()];
        for (int j = 0; j < arrayListNonDivisible.size(); j++) {
            m2[j] = arrayListNonDivisible.get(j);
        }
        System.out.println("вот массив m2: " + Arrays.toString(m2));
    }
}
