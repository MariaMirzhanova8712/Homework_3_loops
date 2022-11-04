package HomeWork_3;

public class SimpleNumbers {
    public static void main(String args[]) {
// проверить, простое ли число.Простое число это такое число, которое не делится ни на какое другое число нацело
        System.out.println("Позитивные проверки");
        System.out.println(isSimple(2));  //простое число по википедии
        System.out.println(isSimple(17)); //простое число по википедии
        System.out.println(isSimple(19)); //простое число по википедии
        System.out.println("Негативные проверки");
        System.out.println(isSimple(20)); //число не является простым согласно википедии
        System.out.println(isSimple(60)); //число не является простым согласно википедии
        System.out.println(isSimple(100)); //число не является простым согласно википедии
    }

    public static String isSimple(int number) { // строковый метод который принимает на вход целое число типа int
        if (number == 2) {
            return "Число 2 простое";
        }
        int i = 2;
        while (i < number) {       //цикл с предусловием
            if (number % i == 0) {  // проверяем делится ли заданное число на число 2 или на большее число, но не превышающее его самого за вычетом единицы (1)
                return "Число " + number + " НЕ является простым";
            }
            i++;
        }
        return "Число " + number + " простое"; //возвращаем это число с сообщением что оно простое
    }
}