package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison on 3/5/15.
 */

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Double height_feet;
        Double height_inches;
        Double weight;
        Double answer;


        Scanner calculation = new Scanner(System.in);

        System.out.print("Your height (feet only): ");
        height_feet = calculation.nextDouble();

        System.out.print("Your height (inches): ");
        height_inches = calculation.nextDouble();

        System.out.print("Your weight in pounds: ");
        weight = calculation.nextDouble();
        answer = weight / 2.20462262 / ((height_feet * 12 + height_inches) / 39.3701 * (height_feet * 12 + height_inches) / 39.3701);

        System.out.println("Your BMI is " + answer);


    }
}
