package HomeWork_3;

public class PrimeNumbers {
    public static void main(String args[]) {
// проверить, простое ли число
        System.out.println("Позитивные проверки");
        System.out.println(isSimple(2));
        System.out.println(isSimple(17));
        System.out.println(isSimple(19));
        System.out.println(isSimple(61));
        System.out.println("Негативные проверки");
        System.out.println(isSimple(20));
        System.out.println(isSimple(60));
        System.out.println(isSimple(100));
    }
    public static String isSimple(int number) {
        boolean simple = true;
        if (number == 2) {
            return "Число 2 простое";
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                simple = false;
                break;
            }
            i++;
        }
        if (simple) {
            return "Число " + number + " простое";
        } else return "Число " + number + " НЕ является простым";
    }
}