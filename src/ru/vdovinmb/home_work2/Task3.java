package ru.vdovinmb.home_work2;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$
 * в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {
    public static void main(String[] args) {
        int months = 38;
        int salary = 600;//зарплата
        int allowance = 400;//надбавка каждые 6 месяцев.
        int food = 300;//траты на еду
        double profit = 0.02;//доходность 2%
        calculate(months, salary, allowance, food, profit);
    }

    private static void calculate(int months, int salary, int allowance, int food, double profit) {
        double ostatok = 0;
        double broker = 0;
        for (int i = 1; i <= months; i++) {

            if (i % 6 == 0) {
                salary += allowance;
            }
            double toBroker = salary / 10;//переводит брокеру
            ostatok = ostatok + salary - food - toBroker;
            broker = broker * profit + broker + toBroker;
        }
        System.out.println("Остаток на своем счету: " + ostatok);
        System.out.println("Накопления у брокера: " + broker);

    }
}
