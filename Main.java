import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Створення порожнього списка обєктів RGB
        List<RGB> list = new ArrayList<>();

        // Генератор випадкових чисел
        Random random = new Random();

        // Перемінні для записи R, G і B в список
        int r = 0;
        int g = random.nextInt(5) * 51; // Генерує випадково число від 0 до 4 і множить на 51, виходить від 0 до 255 з кроком 51
        int b = 255;

        // Запис елементів в список
        for (int i = 0; i < 6; i++) {
            // Створення обєкта класу RGB з потрібними значеннями кольорів
            RGB color = new RGB(r, g, b);
            // Добавлення в список
            list.add(color);
            // Зміна значень для наступного елемента по умові задачі
            r += 51;
            b -= 51;
            g = random.nextInt(5) * 51;
        }

        // Вивід на екран
        for (int i = 0; i < 3; i++) {
            list.get(i).print();
        }
    }
}

























