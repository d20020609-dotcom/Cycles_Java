/**
 * Примеры всех видов циклов в Java
 * Сохраните этот файл как LoopExamples.java, скомпилируйте и запустите
 */
public class LoopExamples {

    public static void main(String[] args) {

        // ======================= 1. Цикл for (классический) =======================
        System.out.println("=== 1. Классический цикл for ===");
        // Вывод чисел от 0 до 4
        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация for, i = " + i);
        }

        // ======================= 2. Цикл for-each (enhanced for) =======================
        System.out.println("\n=== 2. Цикл for-each ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Элемент массива: " + num);
        }

        // ======================= 3. Цикл while =======================
        System.out.println("\n=== 3. Цикл while ===");
        int count = 0;
        while (count < 3) {
            System.out.println("Итерация while, count = " + count);
            count++;
        }

        // ======================= 4. Цикл do-while =======================
        System.out.println("\n=== 4. Цикл do-while ===");
        int x = 5;
        do {
            System.out.println("Итерация do-while, x = " + x);
            x--;
        } while (x > 0);

        // ======================= 5. Бесконечный цикл с break =======================
        System.out.println("\n=== 5. Бесконечный цикл с прерыванием break ===");
        int counter = 0;
        while (true) {
            System.out.println("Итерация: " + counter);
            counter++;
            if (counter >= 3) {
                System.out.println("Выход из бесконечного цикла через break");
                break;
            }
        }

        // ======================= 6. Использование continue =======================
        System.out.println("\n=== 6. Пропуск итерации с continue ===");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Пропускаем i = 2 (continue)");
                continue; // пропускаем остаток итерации для i=2
            }
            System.out.println("Обработано i = " + i);
        }

        // ======================= 7. Вложенные циклы =======================
        System.out.println("\n=== 7. Вложенные циклы (таблица умножения 3x3) ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // переход на новую строку
        }

        // ======================= 8. Цикл по коллекции (List) =======================
        System.out.println("\n=== 8. Цикл по коллекции ArrayList ===");
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Анна");
        names.add("Борис");
        names.add("Виктор");

        for (String name : names) {
            System.out.println("Имя: " + name);
        }

        // ======================= 9. Выход из вложенных циклов с меткой (label) =======================
        System.out.println("\n=== 9. Выход из вложенных циклов через метку ===");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Найдена точка (2,2) - выход из обоих циклов");
                    break outerLoop;
                }
                System.out.println("(" + i + "," + j + ")");
            }
        }

        // ======================= 10. Цикл с несколькими переменными в for =======================
        System.out.println("\n=== 10. Несколько переменных в for ===");
        for (int a = 0, b = 10; a < b; a++, b--) {
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}