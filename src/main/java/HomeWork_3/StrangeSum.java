package HomeWork_3;

public class StrangeSum {
    public static void main(String args[]) {
        //      1 - 2 + 3 - 4 ...

        double startNumber = 1;
        int multiplier = -1;
        int quantity = 100;
        int i = 1;
        System.out.println("1 - первое слагаемое");

        while (i <= quantity) {
            if (i > 1) {
                System.out.println(i + " слагаемое = " + multiplier * i + " промежуточный результат = " + startNumber);
            }


            if (i == quantity) {
                System.out.println("Результат сложения всех слагаемых: " + startNumber);
            }

            if (i % 2 == 0) {
                multiplier = 1;
            } else {
                multiplier = -1;
            }
            i++;
            startNumber = startNumber + (multiplier * i);

        }


    }
}