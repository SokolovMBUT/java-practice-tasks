package lesson02.part02;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
 * Если введенное число равно нулю, необходимо вывести ноль.
 * Вывести результат на экран.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
 * 4.	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
 * 5.	Если введенное число равно нулю, необходимо вывести ноль.
 */
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число ");
            int a = sc.nextInt();

            if (a > 0) {
                System.out.println(a * 2);
            }
            if (a < 0) {
                System.out.println(a + 1);
            }
            if (a == 0) {
                System.out.println("zero");
            }

        }
    }

}