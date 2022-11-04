package HomeWork_3;

public class ReservesBuckwheat {

    public static void main(String args[]) {
//  вес гречки в запасах
        int weight = 100;
//  стоимость хранения 1 кг гречки в месяц
        int costKgPerMonth = 100;
//  расход гречки за месяц
        int expenditurePerMonth = 6;
// Денег потрачено
        int price = 0;
// Счетчик месяцев
        int month = 1;
        while (weight > 0) {
            price = price + (weight * costKgPerMonth);
            weight = weight - expenditurePerMonth;
            month++;
        }
        System.out.println("Денег потрачено: " + price);
        System.out.println("Месяцев прошло: " + month);
    }
}
