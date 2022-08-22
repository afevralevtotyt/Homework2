public class Main {
    public static void main(String[] args) {
        // task 1

        byte b = 1;
        short s = 23445;
        int i = 1234124543;
        long l = 1234545476476568778L;
        float f = 4.5f;
        double d = 3.444556665655767;
        boolean bool = true;

        // task 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        System.out.println("Общий вес боксеров "+ (secondBoxerWeight + firstBoxerWeight) +" кг");
        System.out.println("Разница в весе боксеров "+ (secondBoxerWeight - firstBoxerWeight) +" кг");

        // task 3

        byte babanWeight = 80;
        int totalBananasWeight = babanWeight*5;
        byte milkWeight = 105;
        int totalMilkWeight = 200/100 * milkWeight;
        short totalIceCreamWeight = 2*100;
        byte eggWeight = 70;
        int totalEggsWeight = eggWeight*4;
        float totalWeight = totalBananasWeight + totalMilkWeight + totalEggsWeight + totalIceCreamWeight;
        System.out.println("Общий вес коктейля в граммах "+ totalWeight+ " в килограммах: "+ (totalWeight/1000));

        // task 4

        byte summaryWeightLoss = 7;
        float maxDayLoss = 500/1000f;
        float minDayLoss = 250/1000f;
        int fastWeightLoss = (int)Math.ceil(summaryWeightLoss/maxDayLoss);
        int slowWeightLoss = (int)Math.ceil(summaryWeightLoss/minDayLoss);
        int averageWeightLoss = (int)Math.ceil(summaryWeightLoss/((maxDayLoss+minDayLoss)/2));

        System.out.println("В случае самой быстрой потери веса, спортсмен похудеет за "+ fastWeightLoss+" дней, в случае " +
                "медленной потери веса спортсмен похудеет за " + slowWeightLoss+ " дней, в среднем похудение займет " +
                averageWeightLoss+ " дней");


        // task 5

        int mashasIncome = 67760;
        int denisIncome = 83690;
        int christinasIncome = 76230;
        float increase = 1.1f;
        float newMashasIncome = mashasIncome*increase;
        float newDenisIncome = denisIncome*increase;
        float newchristinasIncome = christinasIncome*increase;

        System.out.println("Маша теперь получает " +newMashasIncome + " рублей, годовой доход вырос на " +
                (newMashasIncome*12-mashasIncome*12)+" рублей");
        System.out.println("Денис теперь получает " +newDenisIncome + " рублей, годовой доход вырос на " +
                (newDenisIncome*12-denisIncome*12)+" рублей");
        System.out.println("Кристина теперь получает " +newchristinasIncome + " рублей, годовой доход вырос на " +
                (newchristinasIncome*12-christinasIncome*12)+" рублей");
    }
}