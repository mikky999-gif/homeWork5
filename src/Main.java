//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Задача 1
Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        System.out.println("Задание 1");
        int cat = 168979;
        byte dog = 68;
        short mouse = 25789;
        long people = 3789654789678L;
        float apple = 5.467F;
        double meet = 6.78926786;
        System.out.println("Значение переменной cat с типом int равно " + cat + ".");
        System.out.println("Значение переменной dog с типом byte равно " + dog + ".");
        System.out.println("Значение переменной mouse с типом short равно " + mouse + ".");
        System.out.println("Значение переменной people с типом long равно " + people + ".");
        System.out.println("Значение переменной apple с типом float равно " + apple + ".");
        System.out.println("Значение переменной meet с типом double равно " + meet + ".");
/*Задача 2
Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
Значения:
27.12
987 678 965 549
2,786
569
-159
27897
67 */
        System.out.println("Задание 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c =2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
/* Задача 3
Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
Для объявления переменных не используйте тип var.*/
        System.out.println("Задание 3");
        byte studentsLyudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkatetina = 30;
        short totalPaper = 480;
        int paperByOne = totalPaper / (studentsLyudmila + studentsAnna + studentsEkatetina);
        System.out.println("На каждого ученика рассчитано " + paperByOne + " листов бумаги.");
/*Задача 4
Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
за 20 минут,
в сутки,
за 3 дня,
за 1 месяц?
Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
Для объявления переменных не используйте тип var.*/
        System.out.println("Задание 4");
        byte efficiencyByMinute = 16 / 2;
        int efficiencyBy20Minutes = efficiencyByMinute * 20;
        int efficiencyByDay = efficiencyByMinute * 60 * 24;
        int efficiencyBy3Days = efficiencyByDay * 3;
        int efficiencyBy30Days = efficiencyByDay * 30;
        System.out.println("За 20 минут машина произвела " + efficiencyBy20Minutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + efficiencyByDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + efficiencyBy3Days + " штук бутылок.");
        System.out.println("За 30 дней машина произвела " + efficiencyBy30Days + " штук бутылок.");
/*Задача 5
На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
Для объявления переменных не используйте тип var.*/
        System.out.println("Задание 5");
        byte whiteByClass = 2;
        byte brownByClass = 4;
        byte totalColour = 120;
        int totalClasses = totalColour / (whiteByClass + brownByClass);
        int whiteTotal = totalClasses * whiteByClass;
        int brownTotal = totalClasses * brownByClass;
        System.out.println("В школе, где " +  totalClasses + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски.");
/*Задача 6
Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
Вот один из рецептов, по которому спортсмен готовит себе завтрак:
Бананы — 5 штук (1 банан — 80 грамм).
Молоко — 200 мл (100 мл = 105 грамм).
Мороженое-пломбир — 2 брикета по 100 грамм.
Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
Смешать всё в блендере — и готово.
Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
Результат в граммах и килограммах напечатайте в консоль.
Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм), а не считать самим общую сумму граммов.*/
        System.out.println("Задание 6");
        short totalWeightBabanas = 5 * 80;
        short totalWeightMilk = 2 * 105;
        short totalWeightIceCream = 2 * 100;
        short totalWeightEggs = 4 * 70;
        int totalWeightGramm = totalWeightBabanas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        double totalWeightKg = totalWeightGramm / 1000;
        System.out.println("Общий вес спортзавтрака " + totalWeightGramm + " грамм.");
        System.out.println("Общий вес спортзавтрака " + totalWeightKg + " кг.");
        /*Задача 7
Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
Результаты всех подсчетов выведите в консоль.*/
        System.out.println("Задание 7");
        byte totalLessKg = 7;
        int totalLessGramm = totalLessKg * 1000;
        short careLessDay = 250;
        short hardLessDay = 500;
        int daysCare = totalLessGramm / careLessDay;
        int daysHard = totalLessGramm / hardLessDay;
        int daysMiddle = (daysCare + daysHard) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему потребуется "
                + daysCare + " дней для достижения результата, а если он будет терять по 500 грамм каждый день, то потребуется "
                + daysHard + " дней. В среднем, спортсмену может потребоваться "
                + daysMiddle + " день для достижения результата. ");
/*Задача 8
Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц.
Денис получает 83 690 рублей в месяц.
Кристина получает 76 230 рублей в месяц.
Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/
        System.out.println("Задание 8");
        int mariyaMonthOld = 67760;
        int denisMonthOld = 83690;
        int kristinaMonthOld = 76230;
        int mariyaMonthNew = mariyaMonthOld / 100 * 110;
        int denisMonthNew = denisMonthOld / 100 * 110;
        int kristinaMonthNew = kristinaMonthOld / 100 * 110;
        int mariyaYearOld = mariyaMonthOld * 12;
        int denisYearOld = denisMonthOld * 12;
        int kristinaYearOld = kristinaMonthOld *12;
        int mariyaYearNew = mariyaMonthNew * 12;
        int denisYearNew = denisMonthNew * 12;
        int kristinaYearNew = kristinaMonthNew *12;
        int mariyaDiff = mariyaYearNew - mariyaYearOld;
        int denisDiff = denisYearNew - denisYearOld;
        int kristinaDiff = kristinaYearNew - kristinaYearOld;
        System.out.println("Маша теперь получает " + mariyaMonthNew + " рублей. Годовой доход вырос на " + mariyaDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaMonthNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей.");
    }
}