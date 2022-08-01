public class Main {
    public static void main(String[] args) {
        //задание1
        byte One = 5;
        short dog = 1;
        int rat = 2;
        long mouse = 2000L;
        float sugarWeight = 1.98f;
        double saltWeight = 1.93;

        //задание 2
        float boxerA = 78.2f;
        float boxerB = 82.7f;
        float weightAllBoxers = boxerA + boxerB;
        System.out.println(weightAllBoxers);
        float weightDifference = boxerA - boxerB;
        System.out.println(weightDifference);

        //задание 3

        double bananaOne = 80;
        double milkOne = 105;
        double strawberryIceCreamOne = 100;
        double edds = 70;
        double weight = bananaOne * 5 + milkOne * 2 + strawberryIceCreamOne * 2 + edds * 4;
         System .out.println(weight);
         double weighKg = weight / 1000;
         System.out.println(weighKg);


         //задание 4

        var oneDay = 250;
        var lossWeight = 7*1000;
        var Days = lossWeight / oneDay;
        System.out.println(Days);

        var tDay = 500;
        var lossTW = 7 * 1000;
        var daysT = lossTW / tDay;
        System.out.println("Дни по 500 " + daysT);


        //Задание 5
        var masha = 67760;
        var denis = 83690;
        var kris = 76230;
        var mashaNew = masha + masha * 0.1;
        var denisNew = denis + denis * 0.1;
        var krisNew = kris + kris * 0.1;
        System.out.println("ЗП Маша " + mashaNew);
        System.out.println("ЗП Денис " + denisNew);
        System.out.println("ЗП Кристина " + krisNew);
        var mashaNY = mashaNew * 12;
        var denisNY = denisNew * 12;
        var krisNY = krisNew * 12;
        System.out.println("М нов ЗПГ " + mashaNY);
        System.out.println("D нов ЗПГ " + denisNY);
        System.out.println("K нов ЗПГ " + krisNY);
        var differM= mashaNY - masha*12;
        var differD = denisNY - denis*12;
        var differK = krisNY - kris*12;
        System.out.println("М разница " + differM);
        System.out.println("D разница " + differD);
        System.out.println("K разница " + differK);





    }
}