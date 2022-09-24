/*Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
*Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/

package HW2;

public class Homework2 {

    public static void main(String[] args) {
        String first = "London is the capital of Great Britain";
        System.out.println("вот первая строка: " + first);
        String second = "capital";
        System.out.println("вот вторая строка: " + second);
        if (first.contains(second)) System.out.println("наименьшее окно в строке first: " + second);

        String reverse1 = "";
        for (int i = 0; i < first.length(); i++) {
         reverse1 = first.charAt(i) + reverse1;
            }
        System.out.println("в перевернутом виде строка first выглядит так: " + reverse1);

        String reverse2 = "";
        for (int i = 0; i < second.length(); i++) {
            reverse2 = second.charAt(i)+reverse2;
            }
        System.out.println("в перевернутом виде строка second выглядит так: " + reverse2);

        if (reverse1.equals(second) | reverse2.equals(first)) {
            System.out.println("две данные строки являются вращением друг друга.");
        }
        else {System.out.println("две данные строки НЕ являются вращением друг друга.");}

        
        int a = 3;
        int b = 56;
        
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(String.format("%d + %d = %d\n", a, b, a + b));
        strBuilder.append(String.format("%d - %d = %d\n", a, b, a - b));
        strBuilder.append(String.format("%d * %d = %d\n", a, b, a * b));
        System.out.println(strBuilder.toString());

        long start1, end1;
        start1 = System.currentTimeMillis();
        System.out.println(strBuilder.toString().replace("=", "равно"));
        end1 = System.currentTimeMillis();
        long time1 = end1 - start1; 
        System.out.println("Замена все знаков '=' на слово 'равно' заняла " + time1 + " миллисекунд(-ы)");

        String strTemp = "";
        long start2, end2;
        start2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            strTemp += "=";
        }

        end2 = System.currentTimeMillis();
        long time2 = end2 - start2; 
        System.out.println("Положить в String 10000 знаков '=' заняло " + time2 + " миллисекунд");

    }
    
}
