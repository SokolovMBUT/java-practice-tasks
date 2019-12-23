package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2.	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
 * 3.	Программа должна добавлять строки в начало списка.
 * 4.	Программа должна выводить список на экран, каждое значение с новой строки.
 */

public class Task05 {

  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      String s = r.readLine();
      list.add(0, s);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));

    }
  }
}
