package task1;

import java.util.Scanner;

public class main1 {
    public static int SumOfNum (String str) {
        //исключение символов, кроме цифр
        String numberOnly = str.replaceAll("[^0-9]", "");

        int count = 0, sum = 0;
        char symbol = ' ';
        //если длина строки 0 - выводим 0
        if (numberOnly.length() == 0)
            sum = 0;
        else {
            for (int i=0; i<numberOnly.length(); i++) {
                //посимвольно прибавляем цифры из строки с помощью преобразования
                symbol = numberOnly.charAt(i);
                count = Character.getNumericValue(symbol);
                sum += count;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //ввод строки с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //вызов функции
        System.out.println(SumOfNum(str));
    }
}
