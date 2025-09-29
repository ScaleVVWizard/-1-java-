
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        
        System.out.println("\n Задание 2");
        task2();
        
        System.out.println("\n Задание 3 ");
        task3(1, -3, 2); // x^2 - 3x + 2 = 0 (корни:: 1 и 2)
        task3(1, 2, 5);  // x^2 + 2x + 5 = 0 (нет вещественных корней)
        
        System.out.println("\n Задание 4 ");
        task4();
        
        System.out.println("\n Задание 5 ");
        task5("radar");
        task5("hello");
        task5("А роза упала на лапу Азора");
    }
    
    // Задание 1: FizzBuzz для чисел 1-500
    public static void task1() {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    // Задание 2: Переворот строки
    public static void task2() {
        String str = "make install";
        System.out.println("Исходная строка: " + str);
        System.out.print("Перевернутая строка: ");
        
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
    // Задание 3: Решение квадратного уравнения
    public static void task3(double a, double b, double c) {
        System.out.println("Уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            System.out.println("нет вещественных корней");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    
    // Задание 4: Сумма ряда
    public static void task4() {
        double sum = 0;
        double term;
        int n = 2;
        
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);
        
        System.out.println("Сумма ряда: " + sum);
        System.out.println("Количество просуммированных членов: " + (n - 2));
    }
    
    // Задание 5: Проверка палиндрома
    public static void task5(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        
        for (int i = 0; i < cleanedStr.length() / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(cleanedStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Строxка \"" + str + "\" " + 
                          (isPalindrome ? "является палиандромом" : "не является палиандромом"));
    }
}