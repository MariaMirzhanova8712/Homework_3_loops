package HomeWork_3;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {            //счетчик цифр по горизонтали
            for (int j = 1; j < 10; j++) {        //счетчик цифр по вертикали
                System.out.printf("%d\t", i * j); //вывод строки на печать с помощью функции printf
            }
            System.out.println();                 //переход печати на следующую строку
        }
    }
}
