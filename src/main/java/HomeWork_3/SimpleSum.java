package HomeWork_3;

public class SimpleSum {
    public static void main(String args[]) {

        double startNumber = 1; //член  прогрессии
        int q = 2; //знаменатель прогрессии
        int i = 1; //счетчик членов прогрессии

        while (i <= 100) {
            startNumber = startNumber * q;
            System.out.println(startNumber);
            i++;
        }

    }

}



