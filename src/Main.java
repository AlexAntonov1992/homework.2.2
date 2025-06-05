public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, ");
        //1
        int xzz = 1000000;
        byte xzzz = 127;
        short xzzzz = 23000;
        long xzzzzz = 4000777L;
        float xzzzzzz = 5.25f;
        double xzzzzzzz = 6.445;
        System.out.println("Значение переменной int с типом целочисленные равно " + xzz);
        System.out.println("Значение переменной byte с типом целочисленные равно " + xzzz);
        System.out.println("Значение переменной short с типом целочисленные равно " + xzzzz);
        System.out.println("Значение переменной long с типом целочисленные равно " + xzzzzz);
        System.out.println("Значение переменной float с типом с плавающей точкой равно " + xzzzzzz);
        System.out.println("Значение переменной double с типом с плавающей точкой равно " + xzzzzzzz);
        //2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short r = -159;
        short e = 27897;
        byte f = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(r);
        System.out.println(e);
        System.out.println(f);
        //3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheet = 480;
        int st =  sheet / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + st + " листов бумаги");
        //4
        byte bottle = 16 / 2;
        System.out.println("За 20 минут, машина произвела " + bottle + " штук бутылок");
        int xxMin = (bottle * 20);
        System.out.println("За сутки, машина произвела " + xxMin + " штук бутылок");
        int hour = bottle * 60;
        int day = hour * 24;
        System.out.println("За 24 часа, машина произвела " + hour + " штук бутылок");
        int friday = day * 3;
        System.out.println("За 3 дня, машина произвела " + friday + " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц, машина произвела " + month + " штук бутылок");
        //5
        byte paint = 120;
        byte xz = 2 + 4;
        int clas = paint / xz;
        int whitePaint = clas * 2;
        int brownPaint = clas * 4;
        System.out.println("В школе, где " + clas + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
//6
        byte banana = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int weightBanana = banana * 80;
        short weightMilk = 210;
        int weightIceCream = iceCream * 100;
        int weightEggs = eggs * 70;
        int totalWeight = weightBanana + weightMilk + weightIceCream + weightEggs;
        System.out.println(+ totalWeight + " грамм");
        double kg = totalWeight / 1000;
        System.out.println(+ kg + " кг" );
        //7
        byte sport = 7;
        int sportKg = sport * 1000;
        int diet = sportKg / 250;
        System.out.println(+ diet + " дней");
        int diet2 = sportKg / 500;
        System.out.println(+ diet2 + " дней");
        int difference = (diet + diet2) / 2;
        System.out.println(+ difference + " дней");
        //8
        double maha = 67760 * 1.1;
        double mahaxx = maha - 67760;
        double denis = 83690 * 1.1;
        double denisxx = denis - 83690;
        double kris = 76230 * 1.1;
        double krisxx = kris - 76230;
        System.out.println("Маша теперь получает " + maha + " рублей. Годовой доход вырос на " + mahaxx );
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + denisxx );
        System.out.println("Кристина теперь получает " + kris + " рублей. Годовой доход вырос на " + krisxx );
    }
}
