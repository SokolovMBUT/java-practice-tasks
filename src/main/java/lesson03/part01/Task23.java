package lesson03.part01;

/**
 * В классе Cat создай статическую переменную public int catCount.
 * Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
 * статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и
 * вывести значение переменной catCount на экран.
 * <p>
 * Требования:
 * 1.	В классе Cat создай статическую переменную public int catCount.
 * 2.	В классе Cat создай конструктор public Cat() без параметров.
 * 3.	Конструктор должен увеличивать значение статической переменной catCount на 1.
 * 4.	В методе main создай 10 котов.
 * 5.	В методе main, после создания всех котов, выведи значение переменной catCount.
 */

public class Task23 {

  public static void main(String[] args) {
    // Создай 10 котов
    for (int i = 0; i < 10; i++) {
      Cat cat = new Cat();
    }
    // Выведи значение переменной catCount
    System.out.println(Cat.catCount);
  }

  public static class Cat {
    // Создай статическую переменную catCount
    public static int catCount;
    // Создай конструктор
    public Cat(){
      catCount++;
    }
  }
}
