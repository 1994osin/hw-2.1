public class Main {
    public static void main(String[] args) {
        // Task 1
        int myInt = 1_000_000_000;
        byte myByte = 127;
        short myShort = -32000;
        long myLong = 9_000_000_000L;
        float myFloat = 3.1415F;
        double myDouble = 12.9324234;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // Task 2
        double d1 = 27.12;
        long l1 = 987678965549L;
        byte b1 = 2;
        short s1 = 786;
        boolean bool1 = false;
        short s2 = 569;
        short s3 = -159;
        int i1 = 27897;
        float f1 = 67.F;

        // Task 3
        byte studentsOfLudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        int totalPaper = 480;
        int sheetsOfPaperPerPupil = totalPaper /
                (studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna);
        System.out.println("На каждого ученика расчитанно " + sheetsOfPaperPerPupil + " листов бумаги");

        // Task 4
        int machinePerformanceInTwoMinutes = 16;
        int machinePerformanceInOneMinutes = machinePerformanceInTwoMinutes / 2;
        int machinePerformanceInTwentyMinutes = machinePerformanceInOneMinutes * 20;
        int machineProductivityPerDay = machinePerformanceInOneMinutes * 60 * 24;
        int machineProductivityInThreeDays = machineProductivityPerDay * 3;
        int machineProductivityPerMonth = machineProductivityPerDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + machinePerformanceInTwentyMinutes + " штук");
        System.out.println("За сутки машина произвела бутылок " + machineProductivityPerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + machineProductivityInThreeDays + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + machineProductivityPerMonth + " штук");

        // Task 5
        byte totalColors = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int totalClasses = totalColors / (whitePaintForOneClass + brownPaintForOneClass);
        int totalWhitePaint = totalClasses * whitePaintForOneClass;
        int totalBrownPaint = totalClasses * brownPaintForOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Task 6
        byte bananas = 5;
        byte weightOfOneBananaInGrams = 80;
        short milkInMilliliters = 200;
        float gramsInOneHundredMillilitersOfMilk = 105;
        float gramsInOneMilliliterOfMilk = gramsInOneHundredMillilitersOfMilk / 100;
        byte iceCream = 2;
        byte gramsInOneIceCream = 100;
        byte eggs = 4;
        byte gramsInOneEgg = 70;
        float onlyGramsInBreakfast = (bananas * weightOfOneBananaInGrams) + (milkInMilliliters * gramsInOneMilliliterOfMilk)
                + (iceCream * gramsInOneIceCream) + (eggs * gramsInOneEgg);
        float onlyKilogramsInBreakfast = onlyGramsInBreakfast / 1000;
        System.out.println("Завтрак спортсмена составляет " + onlyKilogramsInBreakfast + " кг");

        // Task 7
        byte loseWeightInKilograms = 7;
        int loseWeightInGrams = loseWeightInKilograms * 1000;
        short lose250GramsPerDay = 250;
        short lose500GramsPerDay = 500;
        int daysIfWeLose250Grams = loseWeightInGrams / lose250GramsPerDay;
        int daysIfWeLose500Grams = loseWeightInGrams / lose500GramsPerDay;
        int daysToLoseWeightOnAverage = (daysIfWeLose250Grams + daysIfWeLose500Grams) / 2;
        System.out.println("Если мы худеем на " + lose250GramsPerDay + " грамм в день, то нам потребуется " + daysIfWeLose250Grams + " дней");
        System.out.println("Если мы худеем на " + lose500GramsPerDay + " грамм в день, то нам потребуется " + daysIfWeLose500Grams + " дней");
        System.out.println("В среднем нам потребуется " + daysToLoseWeightOnAverage + " день для похудения");

        // Task 8
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double mashaSalaryAfterThePromotion = (mashaSalary * 0.1) + mashaSalary;
        double mashaSalaryDifference = mashaSalaryAfterThePromotion - mashaSalary;
        double denisSalaryAfterThePromotion = (denisSalary * 0.1) + denisSalary;
        double denisSalaryDifference = denisSalaryAfterThePromotion - denisSalary;
        double kristinaSalaryAfterThePromotion = (kristinaSalary * 0.1) + kristinaSalary;
        double kristinaSalaryDifference = kristinaSalaryAfterThePromotion - kristinaSalary;
        System.out.println("Маша теперь получает " + mashaSalaryAfterThePromotion + " рублей. " +
                "Годовой доход вырос на " + mashaSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterThePromotion + " рублей. " +
                "Годовой доход вырос на " + denisSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryAfterThePromotion + " рублей. " +
                "Годовой доход вырос на " + kristinaSalaryDifference + " рублей");
    }
}