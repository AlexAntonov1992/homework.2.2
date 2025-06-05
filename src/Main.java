public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        //2
        int a = 57;
        byte b = 100;
        short c = -159;
        short d = 569;
        short r = 27897;
        long e = 987678965549L;
        float f = 27.17f;
        double g = 2.786;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(r);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
//3
        int lp = 23;
        int as = 27;
        int ea = 30;
        int sheet = 480;
        int st =  sheet / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + st + " листов бумаги");
        //4
        int bottle = 16 / 2;
        System.out.println(bottle);
        int xxMin = bottle * 20;
        System.out.println(xxMin);
        int hour = bottle * 60;
        int day = hour * 24;
        System.out.println(hour);
        int friday = day * 3;
        System.out.println(friday);
        int month = day * 30;
        System.out.println(month);
        //5
        int paint = 120;
        int xz = 2 + 4;
        int clas = paint / xz;
        System.out.println(clas);
        int whitePaint = clas * 2;
        int brownPaint = clas * 4;
        System.out.println(clas);
        System.out.println(whitePaint);
        System.out.println(brownPaint);
        System.out.println("В школе, где " + clas + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
//6
        int banana = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int weightBanana = banana * 80;
        int weightMilk = 210;
        int weightIceCream = iceCream * 100;
        int weightEggs = eggs * 70;
        int totalWeight = weightBanana + weightMilk + weightIceCream + weightEggs;
        System.out.println(+ totalWeight + " грамм");
        double kg = totalWeight / 1000;
        System.out.println(+ kg + " кг" );
        //7
        int sport = 7;
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
