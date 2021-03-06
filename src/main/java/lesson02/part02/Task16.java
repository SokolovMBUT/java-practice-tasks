package lesson02.part02;

/**
 * Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит
 * зелёный сигнал, затем в течение одной минуты — жёлтый, а потом в течение одной минуты — красный, затем опять зелёный
 * горит три минуты и т. д. Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала
 * очередного часа. Определить, сигнал какого цвета горит для пешеходов в этот момент. Результат вывести на экран в
 * следующем виде: "зелёный" - если горит зелёный цвет, "жёлтый" - если горит жёлтый цвет, "красный" - если горит
 * красный цвет. Пример для числа 2.5: зелёный Пример для числа 3: жёлтый Пример для числа 4: красный Пример для числа
 * 5: зелёный
 * <p>
 * <p>
 * Требования: 1.	Программа должна считывать вещественное число c клавиатуры. 2.	Программа должна выводить текст на
 * экран. 3.	Если горит зелёный цвет, необходимо вывести текст: "зелёный" 4.	Если горит жёлтый цвет, необходимо вывести
 * текст: "жёлтый" 5.	Если горит красный цвет, необходимо вывести текст: "красный"
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Task16 {

  public static void main(String[] args) throws Exception {

/*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите время ");
    String sA = reader.readLine();
    double t = Double.parseDouble(sA);
    Double a= t%5;*/

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Введите время ");
    double t = sc.nextDouble();
    double a = t % 5;
    if (a >= 0 && a < 3) {
      System.out.println("Green");
    } else if (a >= 3 && a < 4) {
      System.out.println("Yellow");
    } else {
      System.out.println("Red");
    }
  }
}
