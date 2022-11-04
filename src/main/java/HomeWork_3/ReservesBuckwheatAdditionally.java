package HomeWork_3;

public class ReservesBuckwheatAdditionally {

    public static void main(String args[]) {
//  Срок в течение которого надо питаться гречкой в месяцах
        int feedPeriod = 12;
//  расход гречки за месяц
        int expenditurePerMonth = 3;
//  вес гречки в запасах
        int weight = feedPeriod * expenditurePerMonth;
//  стоимость хранения 1 кг гречки в месяц
        int costKgPerMonth = 100;
// Денег потрачено
        int price = 0;
// Счетчик месяцев
        int month = feedPeriod;
//  Необходимое исходное количество гречки
        int weightToStore = feedPeriod * expenditurePerMonth;
        while (month > 0) {
            weight = weight - expenditurePerMonth; //вычисляем вес гречки за которую надо оплатить хранение
            price = price + (weight * costKgPerMonth); //рассчитываем стоимость хранения
            month--; //количество оставшихся месяцев уменьшается на 1

        }
        System.out.println("Чтобы питаться гречкой в течение " + feedPeriod + " месяцев нужно:");
        System.out.println("Денег потратить: " + price);
        System.out.println("Запасти гречки: " + weightToStore);
    }
}
