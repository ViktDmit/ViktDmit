import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            start();
        }

        static void start() {
            System.out.println("Введите вашу сумму:");
            Scanner scanner = new Scanner(System.in);
            int valueSum = scanner.nextInt();

            System.out.println("Выберите нужную валюту:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. CNY");
            System.out.println("4. AED");
            int choiceType = scanner.nextInt();

            String resultStr = convertCurrency(valueSum, choiceType);
            double result = Double.parseDouble(resultStr);
            DecimalFormat df = new DecimalFormat("#.##");
            String finalResult = df.format(result);
            System.out.println("По текущему курсу сумма составит: " + finalResult);
            start(); //
        }

        static String convertCurrency(int valueSum, int choiceType) {
            double rubToUsd = 0.013;
            double rubToEur = 0.011;
            double rubToCny = 0.09;
            double rubToAed = 0.046;

            switch (choiceType){
                case 1:
                    double usdResult = valueSum * rubToUsd;
                    return String.valueOf(usdResult);
                case 2:
                    double eurResult = valueSum * rubToEur;
                    return String.valueOf(eurResult);
                case 3:
                    double cnyResult = valueSum * rubToCny;
                    return String.valueOf(cnyResult);
                case 4:
                    double aedResult = valueSum * rubToAed;
                    return String.valueOf(aedResult);
            }
            return "0";
        }
}