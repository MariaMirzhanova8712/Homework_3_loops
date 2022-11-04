package HomeWork_3;

public class FamousFizzBuzz {
    //если число делится нацело на 3 печатать fizz
    //если число делится нацело на 5  печатать buzz
    //если число делится и на три и на пять печатать FizzBuzz
    public static void main(String args[]) {

        int i = 0;
        while (i <= 100) {
            i++;
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            }
        }
    }
}

