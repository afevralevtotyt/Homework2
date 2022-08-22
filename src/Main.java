import java.lang.management.MemoryUsage;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        byte b = 1;
        short s = 23445;
        int i = 1234124543;
        long l = 1234545476476568778L;

        float f = 4.5f;
        double d = 3.444556665655767;

        boolean bool = true;

        char ch = 'c';
    }
    public static void task2() {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        System.out.println("Общий вес боксеров "+ (secondBoxerWeight + firstBoxerWeight) +" кг");
        System.out.println("Разница в весе боксеров "+ Math.abs(secondBoxerWeight - firstBoxerWeight) +" кг");
    }
    public static void task3() {
        byte babanWeight = 80;
        int totalBananasWeight = babanWeight*5;
        byte milkWeight = 105;
        int totalMilkWeight = 200/100 * milkWeight;
        short totalIceCreamWeight = 2*100;
        byte eggWeight = 70;
        int totalEggsWeight = eggWeight*4;
        float totalWeight = totalBananasWeight + totalMilkWeight + totalEggsWeight + totalIceCreamWeight;
        System.out.println("Общий вес коктейля в граммах "+ totalWeight+ " в килограммах: "+ (totalWeight/1000));

    }
    public static void task4(){
        byte summaryWeightLoss = 7;
        float maxDayLoss = 500/1000f;
        float minDayLoss = 250/1000f;
        int fastWeightLoss = (int)Math.ceil(summaryWeightLoss/maxDayLoss);
        int slowWeightLoss = (int)Math.ceil(summaryWeightLoss/minDayLoss);
        int averageWeightLoss = (int)Math.ceil((fastWeightLoss+slowWeightLoss)/2);

        System.out.println("В случае самой быстрой потери веса, спортсмен похудеет за "+ fastWeightLoss+" дней, в случае " +
                "медленной потери веса спортсмен похудеет за " + slowWeightLoss+ " дней, в среднем похудение займет " +
                averageWeightLoss+ " дней");


    }

    public static void task5(){
        int mashasIncome = 67760;
        int denisIncome = 83690;
        int christinasIncome = 76230;
        int increase = 10;
        double multiplier = increase/(100*1.0);
        double newMashasIncome =mashasIncome*multiplier + mashasIncome;
        double newDenisIncome = denisIncome*multiplier + denisIncome;
        double newchristinasIncome = christinasIncome*multiplier + christinasIncome;

        System.out.println("Маша теперь получает " +newMashasIncome + " рублей, годовой доход вырос на " +
                (newMashasIncome*12-mashasIncome*12)+" рублей");
        System.out.println("Денис теперь получает " +newDenisIncome + " рублей, годовой доход вырос на " +
                (newDenisIncome*12-denisIncome*12)+" рублей");
        System.out.println("Кристина теперь получает " +newchristinasIncome + " рублей, годовой доход вырос на " +
                (newchristinasIncome*12-christinasIncome*12)+" рублей");
    }
}